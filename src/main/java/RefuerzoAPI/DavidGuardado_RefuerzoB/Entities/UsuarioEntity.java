package RefuerzoAPI.DavidGuardado_RefuerzoB.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioEntity {

    //Atributos
    @Column(name = "IDUSUARIO")
    private Long id;
    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "IDGRUPOEXPO")
    private Long idGrupoExpo;

    @Column(name = "IDROL")
    private Long idRol;
    @Column(name = "CORREO")
    private String correo;

    @Column(name = "CONTRASENA")
    private String contrasena;

    //long permite datos primitivos. Eje. 1, 2, 3...
    //Long lo mismo, pero admite NULE.
    @ManyToOne
    @JoinColumn(name = "IDCARGO", referencedColumnName = "IDCARGO")
    private CargoEntity idCargo;
}
