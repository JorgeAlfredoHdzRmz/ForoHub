package forohub.api.domain.cursos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    Page<Curso> findByOrderByIdAsc(Pageable paginacion);
    Optional<Curso> findById(Long id);
}
