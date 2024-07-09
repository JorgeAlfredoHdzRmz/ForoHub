package forohub.api.domain.respuestas;

import jakarta.validation.constraints.NotNull;
import org.aspectj.weaver.ast.Not;

public record DatosRegistroRespuesta(
        @NotNull
        String mensaje,
        @NotNull
        Long idtopico,
        @NotNull
        Long idusuario,
        @NotNull
        String solucion

) {
}
