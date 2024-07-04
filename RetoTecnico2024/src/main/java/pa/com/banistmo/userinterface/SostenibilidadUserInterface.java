package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SostenibilidadUserInterface {

    public static final Target H1_SOSTENIBILIDAD = Target.the("titulo de la pagina de sostenibilidad ")
            .located(By.xpath("//H1[contains(text(),'Sostenibilidad')]"));
}
