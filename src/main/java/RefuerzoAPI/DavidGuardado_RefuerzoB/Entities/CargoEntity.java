package RefuerzoAPI.DavidGuardado_RefuerzoB.Entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TBCARGO")
@Getter @Setter @ToString @EqualsAndHashCode
public class CargoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cargo")
    @SequenceGenerator(name = "seq_cargo", sequenceName = "seq_cargo", allocationSize = 1)
    @Column(name = "IDCARGO")
    private Long Id;

    @Column(name = "CARGO")
    private String Cargo;

    @OneToMany(mappedBy = "cargo", cascade = CascadeType.ALL)
    private List<UsuarioEntity> usuarios = new ArrayList<>();
}
