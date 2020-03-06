package domain;

import java.util.List;

public interface Rol {
    List<Regla> VisualizarReglas(Usuario usuario);
    boolean ModificarReglas(Usuario usuario, Regla nuevaRegla, Regla viejaRegla);
    boolean CrearReglas(Usuario usuario, Regla nuevaRegla);
    boolean EliminarReglas(Usuario usuario, Regla viejaRegla);
    List<Usuario> VisualizarUsuarios(Usuario usuario);
    boolean ModificarUsuario(Usuario usuario, Usuario nuevoUsuario, Usuario viejoUsuario);
    boolean CrearUsuario(Usuario usuario, Usuario nuevoUsuario);
    boolean EliminarUsuario(Usuario usuario, Usuario viejoUsuario);
    List<Gimnasio> VisualizarGimnasios(Usuario usuario);
    boolean ModificarGimnasio(Usuario usuario, Gimnasio nuevoGimnasio, Gimnasio viejoGimnasio);
    boolean CrearGimnasio(Usuario usuario, Gimnasio nuevoGimnasio);
    boolean EliminarGimnasio(Usuario usuario, Gimnasio viejoGimnasio);
}
