package forohub.api.controller;

import forohub.api.domain.cursos.*;
import forohub.api.domain.respuestas.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {
    @Autowired
    private RespuestaRepository respuestaRepository;

    @PostMapping
    public ResponseEntity<DatosRespuestaRespuesta> registrarRespuesta(@RequestBody @Valid DatosRegistroRespuesta datosRegistroRespuesta, UriComponentsBuilder uriComponentsBuilder) {
       Respuesta respuesta = respuestaRepository.save(new Respuesta(datosRegistroRespuesta));
        DatosRespuestaRespuesta datosRespuestaRespuesta = new DatosRespuestaRespuesta(respuesta.getId(),respuesta.getMensaje(),respuesta.getIdtopico(),respuesta.getFecha_creacion(),respuesta.getIdusuario(),respuesta.getSolucion());
        URI url = uriComponentsBuilder.path("/respuestas/{id}").buildAndExpand(respuesta.getId()).toUri();
        return ResponseEntity.created(url).body(datosRespuestaRespuesta);
    }

    @GetMapping
    public ResponseEntity<Page<DatosListadoRespuesta>> listadoRespuestas(@PageableDefault(size = 5) Pageable paginacion) {
        // return cursoRepository.findAll(paginacion).map(DatosListadoCurso::new);
        return ResponseEntity.ok(respuestaRepository.findByOrderByIdAsc(paginacion).map(DatosListadoRespuesta::new));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaRespuesta> retornaDatosRespuesta(@PathVariable Long id){
        Respuesta respuesta = respuestaRepository.getReferenceById(id);
        var datosrespuesta = new DatosRespuestaRespuesta(respuesta.getId(),respuesta.getMensaje(),respuesta.getIdtopico(),respuesta.getFecha_creacion(),respuesta.getIdusuario(),respuesta.getSolucion());
        return  ResponseEntity.ok(datosrespuesta);
    }

    @PutMapping
    @Transactional
    public ResponseEntity actualizarRespuesta(@RequestBody @Valid DatosActualizarRespuesta datosActualizarRespuesta){
        Respuesta respuesta = respuestaRepository.getReferenceById(datosActualizarRespuesta.id());
        respuesta.actualizarDatos(datosActualizarRespuesta);
        return ResponseEntity.ok(new DatosRespuestaRespuesta(respuesta.getId(),respuesta.getMensaje(),respuesta.getIdtopico(),respuesta.getFecha_creacion(),respuesta.getIdusuario(),respuesta.getSolucion()));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarRespuesta(@PathVariable Long id){
        Respuesta respuesta = respuestaRepository.getReferenceById(id);
        Optional<Respuesta> respuestaAEliminar = respuestaRepository.findById(id);
        if(respuestaAEliminar.isPresent())
        {
            respuestaRepository.deleteById(id);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
