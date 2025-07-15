package RefuerzoAPI.DavidGuardado_RefuerzoB.Models.DTO;

import jakarta.validation.constraints.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @EqualsAndHashCode
@Getter @Setter
public class UsuarioDTO {

    //Atributos
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;

    private Long idGrupoExpo;
    private Long idRol;

    @Email(message = "Debe ser una correo valido")
    private String correo;

    @Size(min = 8, message = "La contraseña debe de tener al menos 8 caracteres")
    private String contrasena;

    @NotNull(message = "El ID de cargo no puede ser nulo")
    @Positive(message = "El ID de cargo debe ser positivo")
    private Long idCargo;
}
