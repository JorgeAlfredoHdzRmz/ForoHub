package forohub.api.domain.topicos;

import forohub.api.domain.cursos.Curso;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotNull
        String titulo,
        @NotNull
        Long idusuario,
        @NotNull
        Long idcurso,
         @NotNull
         String mensaje
//         @NotNull
//         int idcurso
)
{

}
