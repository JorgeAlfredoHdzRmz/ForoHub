package forohub.api.domain.topicos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    Page<Topico> findByStatusTrue(Pageable paginacion);
    Optional<Topico> findById(Long id);
    Page<Topico> findByidcurso(Long id,Pageable paginacion);
    Page<Topico> findByidusuario(Long id, Pageable paginacion);
    void deleteById(Long id);
}
