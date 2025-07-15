package RefuerzoAPI.DavidGuardado_RefuerzoB.Repositories;

import RefuerzoAPI.DavidGuardado_RefuerzoB.Entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Creando repositorio que contenga los métodos para interactuar con la DB
*
*/
@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
