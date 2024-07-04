package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AcercaDeNostrosUserInterface {




    public static final Target LINK_ENTENDIDO = Target.the("link para aceptar los terminos")
            .located(By.xpath("//strong[contains(text(),'Entendido')]"));

    public static final Target LINK_ACERCA_DE_NOSOTROS = Target.the("link para ingresar a Acerca de nosotros")
            .located(By.xpath("//a[@href='/wps/portal/banistmo/acerca-de']"));

    public static final Target LINK_INFORMACION_CORPORATIVA = Target.the("link para ingresar a informacion corporativa")
            .located(By.xpath("//a[contains(text(),'Información Corporativa')]"));


    public static final Target LINK_SOSTENIBILIDAD = Target.the("link para ingresar a la pagina de sostenibilidad")
            .located(By.xpath("//a[@href='/wps/portal/banistmo/acerca-de/informacion-corporativa/sostenibilidad']"));

}
