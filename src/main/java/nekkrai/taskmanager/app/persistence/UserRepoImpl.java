package nekkrai.taskmanager.app.persistence;

import nekkrai.taskmanager.app.modelos.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

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

    @Override
    public List<Usuario> consultarUsuario() {
        String query = "from Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminarUsuario(Long idusuario) {
        Usuario usuario = entityManager.find(Usuario.class, idusuario);
        entityManager.remove(usuario);
    }


}
