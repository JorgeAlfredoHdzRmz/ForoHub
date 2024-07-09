package forohub.api.domain.respuestas;

import forohub.api.domain.topicos.DatosListadoTopico;

public record DatosListadoRespuesta(
        String mensaje,
        Long idtopico,
        String fecha_creacion,
        Long idusuario,
        String solucion

) {
    public DatosListadoRespuesta(Respuesta respuesta){
        this(respuesta.getMensaje(),respuesta.getIdtopico(),respuesta.getFecha_creacion(),respuesta.getIdusuario(),respuesta.getSolucion());
    }
}
