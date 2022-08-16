package nekkrai.taskmanager.app.controladores;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorUsuario {

    @RequestMapping(value = "app/iniciarSesion/{userID}", method = RequestMethod.GET)
    public String iniciarSesion(@PathVariable Long userID) {
        return "Maxe" + userID.toString();
    }
}
