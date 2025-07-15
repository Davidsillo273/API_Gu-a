package RefuerzoAPI.DavidGuardado_RefuerzoB.Controllers;

import RefuerzoAPI.DavidGuardado_RefuerzoB.Models.DTO.UsuarioDTO;
import RefuerzoAPI.DavidGuardado_RefuerzoB.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiUsuario")
public class UsuarioController {

    @Autowired
     UsuarioService acceso;

    //localhost:8080/apiUsuario/datosUsuarios
    @GetMapping("/DatosUsuarios")
    public List<UsuarioDTO> obtenerDatos(){
        return acceso.obtenerTodo();

    }
}
