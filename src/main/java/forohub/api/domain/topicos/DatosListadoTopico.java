package forohub.api.domain.topicos;

public record DatosListadoTopico(
        String titulo,
        String mensaje,
        String fecha_creacion,
        Long idusuario,
        Long idcurso
) {

    public DatosListadoTopico(Topico topico){
        this(topico.getTitulo(), topico.getMensaje(),topico.getFecha_creacion(), topico.getIdusuario(), topico.getIdcurso());
    }
}
