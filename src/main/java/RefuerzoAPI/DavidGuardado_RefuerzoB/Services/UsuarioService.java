package RefuerzoAPI.DavidGuardado_RefuerzoB.Services;

import RefuerzoAPI.DavidGuardado_RefuerzoB.Controllers.UsuarioController;
import RefuerzoAPI.DavidGuardado_RefuerzoB.Entities.UsuarioEntity;
import RefuerzoAPI.DavidGuardado_RefuerzoB.Models.DTO.UsuarioDTO;
import RefuerzoAPI.DavidGuardado_RefuerzoB.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioService {


    @Autowired
    UsuarioRepository repoUsuario;

    //Se guarda en una lista de tipo Entity todos los usuarios encontrados en la DB
    public List<UsuarioDTO> obtenerTodo() {
        List<UsuarioEntity> usuarios = repoUsuario.findAll();
        return usuarios.stream()
                .map(this::convertirAUsuarioDTO)
                .collect(Collectors.toList());
    }

    public UsuarioDTO convertirAUsuarioDTO(UsuarioEntity entity){

        //Este será el obj a retornar
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(entity.getId());

    }
}
