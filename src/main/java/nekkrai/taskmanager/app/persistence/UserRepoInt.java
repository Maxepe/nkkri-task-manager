package nekkrai.taskmanager.app.persistence;

import nekkrai.taskmanager.app.modelos.Usuario;

public interface UserRepoInt {
    Usuario getUsuario(String nombreUsuario);
    Usuario registrarUsuario(Usuario usuario);
}
