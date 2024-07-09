package forohub.api.domain.cursos;

public record DatosListadoCurso(
        String nombre,
        String categoria
) {
    public DatosListadoCurso(Curso curso){
        this(curso.getNombre(),curso.getCategoria());
    }
}
