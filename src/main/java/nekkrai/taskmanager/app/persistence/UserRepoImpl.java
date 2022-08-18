package nekkrai.taskmanager.app.persistence;

import nekkrai.taskmanager.app.modelos.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository @Transactional
public class UserRepoImpl implements UserRepoInt {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Usuario getUsuario(String nombreUsuario) {
        return null;
    }

    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        return entityManager.merge(usuario);
    }
}
