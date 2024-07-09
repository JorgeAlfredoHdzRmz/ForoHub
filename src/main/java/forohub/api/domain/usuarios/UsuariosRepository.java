package forohub.api.domain.usuarios;

import forohub.api.domain.respuestas.Respuesta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuariosRepository extends JpaRepository<Usuario,Long> {
    UserDetails findByLogin(String username);

    Page<Usuario> findByOrderByIdAsc(Pageable paginacion);
}
