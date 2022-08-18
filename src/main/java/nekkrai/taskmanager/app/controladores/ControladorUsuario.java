package nekkrai.taskmanager.app.controladores;

import nekkrai.taskmanager.app.modelos.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/app")
public class ControladorUsuario {

    @RequestMapping(value = "/iniciarsesion/{userID}", method = RequestMethod.GET)
    public String iniciarSesion(@PathVariable Long userID) {
        return "Maxe" + userID.toString();
    }

    @PostMapping(value = "/registrarusuario")
    public void registrarUsuario(@RequestBody Usuario usuario) {

        System.out.println("[INFO] Registrando usuario: " + usuario.getNombreUsuario());
    }
}
