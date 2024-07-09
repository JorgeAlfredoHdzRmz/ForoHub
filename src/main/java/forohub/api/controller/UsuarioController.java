package forohub.api.controller;

import forohub.api.domain.respuestas.DatosActualizarRespuesta;
import forohub.api.domain.respuestas.DatosListadoRespuesta;
import forohub.api.domain.respuestas.DatosRespuestaRespuesta;
import forohub.api.domain.respuestas.Respuesta;
import forohub.api.domain.topicos.*;
import forohub.api.domain.usuarios.*;
import forohub.api.infra.Security.SecurityConfigurations;
import forohub.api.infra.Security.SecurityFilter;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuariosRepository usuariosRepository;

    @Autowired
    private TopicoRepository topicoRepository;


    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public ResponseEntity<DatosRespuestaUsuario> registrarUsuario(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario, UriComponentsBuilder uriComponentsBuilder) {
        Usuario usuario = usuariosRepository.save(new Usuario(datosRegistroUsuario, passwordEncoder));
        DatosRespuestaUsuario datosRespuestaUsuario = new DatosRespuestaUsuario(usuario.getId(), usuario.getNombre(),usuario.getLogin());
        URI url = uriComponentsBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(url).body(datosRespuestaUsuario);
    }

    @GetMapping
    public ResponseEntity<Page<DatosListadoUsuario>> listadoUsuarios(@PageableDefault(size = 2) Pageable paginacion) {
//        return medicoRepository.findAll(paginacion).map(DatosListadoMedico::new);
        return ResponseEntity.ok(usuariosRepository.findByOrderByIdAsc(paginacion).map(DatosListadoUsuario::new));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaUsuario> retornaDatosUsuario(@PathVariable Long id){
        Usuario usuario = usuariosRepository.getReferenceById(id);
        var datosusuario = new DatosRespuestaUsuario(usuario.getId(), usuario.getNombre(), usuario.getLogin());
        return  ResponseEntity.ok(datosusuario);
    }

    @PutMapping
    @Transactional
    public ResponseEntity actualizarUsuario(@RequestBody @Valid DatosActualizarUsuario datosActualizarUsuario){
        Usuario usuario = usuariosRepository.getReferenceById(datosActualizarUsuario.id());
        usuario.actualizarDatos(datosActualizarUsuario,passwordEncoder);
        return ResponseEntity.ok(new DatosRespuestaUsuario(usuario.getId(),usuario.getNombre(),usuario.getLogin()));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarUsuario(@PathVariable Long id){
        Usuario usuario = usuariosRepository.getReferenceById(id);
        Optional<Usuario> usuarioAEliminar = usuariosRepository.findById(id);
        if(usuarioAEliminar.isPresent())
        {
            usuariosRepository.deleteById(id);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/topicos")
    public ResponseEntity<Page<DatosListadoTopico>> obtenerTopicosPorUsuario(@PathVariable Long id, @PageableDefault(size = 5) Pageable paginacion) {
        return ResponseEntity.ok(topicoRepository.findByidusuario(id,paginacion).map(DatosListadoTopico::new));
    }
}
