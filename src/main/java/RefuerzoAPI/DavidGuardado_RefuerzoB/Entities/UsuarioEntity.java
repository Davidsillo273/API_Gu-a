package RefuerzoAPI.DavidGuardado_RefuerzoB.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "TBUSUARIO")
@Getter @Setter
public class UsuarioEntity {

    //Atributos
    @Id
    @Column(name = "IDUSUARIO")
    private Long id;
    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "IDGRUPOEXPO")
    private Long idGrupoExpo;

    @ManyToOne
    @JoinColumn(name = "IDROL", referencedColumnName = "IDROL")
    private RolEntity rol;

    @Column(name = "CORREO")
    private String correo;

    @Column(name = "CONTRASENA")
    private String contrasena;

    //long permite datos primitivos. Eje. 1, 2, 3...
    //Long lo mismo, pero admite NULE.
    @ManyToOne
    @JoinColumn(name = "IDCARGO", referencedColumnName = "IDCARGO")
    private CargoEntity cargo;
}
