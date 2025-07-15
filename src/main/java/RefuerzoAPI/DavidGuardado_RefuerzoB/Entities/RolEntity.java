package RefuerzoAPI.DavidGuardado_RefuerzoB.Entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "TBROL")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RolEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_rol")
        @SequenceGenerator(name = "seq_rol", sequenceName = "seq_rol", allocationSize = 1)
        @Column(name = "IDROL")
        private Long Id;

        @Column(name = "ROL")
        private String Rol;

        @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
        private List<UsuarioEntity> usuarios = new ArrayList<>();
}
