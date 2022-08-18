package nekkrai.taskmanager.app.controladores;

import nekkrai.taskmanager.app.modelos.Usuario;
import nekkrai.taskmanager.app.persistence.UserRepoInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/app")
public class ControladorUsuario {

    @Autowired
    private UserRepoInt userRepo;
    @RequestMapping(value = "/iniciarsesion/{userID}", method = RequestMethod.GET)
    public String iniciarSesion(@PathVariable Long userID) {
        return "Maxe" + userID.toString();
    }

    @PostMapping(value = "/registrarusuario")
    public void registrarUsuario(@RequestBody Usuario usuario) {

        System.out.println("[INFO] Registrando usuario: " + usuario.getNombreUsuario());
    }


    @GetMapping(value = "/consultarusuario")
    public List<Usuario> consultarUsuario() {

        System.out.println("[INFO] Consultando usuario: ");
        return userRepo.consultarUsuario();
    }
}
