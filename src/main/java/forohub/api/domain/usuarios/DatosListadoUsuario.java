package forohub.api.domain.usuarios;

public record DatosListadoUsuario(
        String nombre,
        String login
) {
    public DatosListadoUsuario(Usuario usuario){
        this(usuario.getNombre(),usuario.getLogin());
    }
}
