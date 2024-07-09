package forohub.api.domain.topicos;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
         String mensaje,
         String fecha_creacion,
         boolean status,
         Long idusuario,
         Long idcurso
)
{

}
