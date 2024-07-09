package forohub.api.domain.usuarios;

import jakarta.validation.constraints.NotNull;

public record DatosRegistroUsuario(
        @NotNull
        String nombre,
        @NotNull
        String login,
        @NotNull
        String clave
) {
}
