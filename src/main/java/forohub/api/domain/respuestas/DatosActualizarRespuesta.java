package forohub.api.domain.respuestas;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarRespuesta(
        @NotNull
        Long id,
        String mensaje,
        String solucion
) {
}
