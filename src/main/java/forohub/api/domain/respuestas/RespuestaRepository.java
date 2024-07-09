package forohub.api.domain.respuestas;

import forohub.api.domain.cursos.Curso;
import forohub.api.domain.topicos.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    Page<Respuesta> findByOrderByIdAsc(Pageable paginacion);

    Page<Respuesta> findByidtopico(Long id, Pageable paginacion);
}
