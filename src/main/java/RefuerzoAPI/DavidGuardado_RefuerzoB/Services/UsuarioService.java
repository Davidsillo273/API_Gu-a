package RefuerzoAPI.DavidGuardado_RefuerzoB.Services;

import RefuerzoAPI.DavidGuardado_RefuerzoB.Controllers.UsuarioController;
import RefuerzoAPI.DavidGuardado_RefuerzoB.Entities.UsuarioEntity;
import RefuerzoAPI.DavidGuardado_RefuerzoB.Models.DTO.UsuarioDTO;
import RefuerzoAPI.DavidGuardado_RefuerzoB.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
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

    //Se reciben todos los pasos en formato Entities
    public UsuarioDTO convertirAUsuarioDTO(UsuarioEntity entity){
        //Se crea un obj de tipo DTO, este será el obj a retornar
        UsuarioDTO dto = new UsuarioDTO();
        //Se transfieren los datos del Entity al DTO
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setApellido(entity.getApellido());
        dto.setIdGrupoExpo(entity.getIdGrupoExpo());
        if (entity.getRol() != null){
            dto.setNombreRol(entity.getRol().getRol());
            dto.setIdRol(entity.getRol().getId());
        }else {
            dto.setNombreRol("Sin cargo asignado");
            dto.setIdRol(null);
        }
        dto.setCorreo(entity.getCorreo());
        dto.setContrasena(entity.getContrasena());
        //Si en caso el valor proveniente de Entity es null se procede a guardar null en el DTO
        //En caso el cargo no sea Null, se guarda su ID
        if (entity.getCargo() != null){
            dto.setNombreCargo(entity.getCargo().getCargo());
            dto.setIdCargo(entity.getCargo().getId());
        }else {
            dto.setNombreCargo("Sin cargo asignado");
            dto.setIdCargo(null);
        }
        //Se retornan los valores en formato DTO
        return dto;

    }
}
