package forohub.api.domain.respuestas;

public record DatosRespuestaRespuesta(
        Long id,
        String mensaje,
        Long idtopico,
        String fecha_creacion,
        Long idusuario,
        String solucion
) {
}
