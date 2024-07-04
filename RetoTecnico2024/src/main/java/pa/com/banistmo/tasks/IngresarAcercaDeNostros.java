package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static pa.com.banistmo.userinterface.AcercaDeNostrosUserInterface.*;

public class IngresarAcercaDeNostros implements Task {


    public static IngresarAcercaDeNostros deBanistmo() {
        return Tasks.instrumented(IngresarAcercaDeNostros.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LINK_ENTENDIDO));
        actor.attemptsTo(Click.on(LINK_ACERCA_DE_NOSOTROS));
        actor.attemptsTo(Click.on(LINK_INFORMACION_CORPORATIVA));
        actor.attemptsTo(Click.on(LINK_SOSTENIBILIDAD));

    }
}
