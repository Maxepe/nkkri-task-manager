package nekkrai.taskmanager.app.persistence;

import nekkrai.taskmanager.app.modelos.Usuario;

import java.util.List;

public interface UserRepoInt {
    Usuario getUsuario(String nombreUsuario);
    Usuario registrarUsuario(Usuario usuario);

    List<Usuario> consultarUsuario();

    void eliminarUsuario(Long idusuario);
}
