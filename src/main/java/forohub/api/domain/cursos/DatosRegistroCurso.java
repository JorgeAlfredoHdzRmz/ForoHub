package forohub.api.domain.cursos;

import jakarta.validation.constraints.NotNull;

public record DatosRegistroCurso(
        @NotNull
        String nombre,
        @NotNull
        String categoria
) {
}
