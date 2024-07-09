package forohub.api.domain.cursos;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarCurso(
        @NotNull Long id,
        String nombre,
        String categoria
) {
}
