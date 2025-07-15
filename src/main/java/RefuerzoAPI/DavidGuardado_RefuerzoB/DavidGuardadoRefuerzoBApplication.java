package RefuerzoAPI.DavidGuardado_RefuerzoB;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DavidGuardadoRefuerzoBApplication {

	public static void main(String[] args) {
		//Cargar variables del archivo .env
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
		dotenv.entries().forEach(entry ->
				System.setProperty(entry.getKey(), entry.getValue())
		);
		SpringApplication.run(DavidGuardadoRefuerzoBApplication.class, args);
	}

}
