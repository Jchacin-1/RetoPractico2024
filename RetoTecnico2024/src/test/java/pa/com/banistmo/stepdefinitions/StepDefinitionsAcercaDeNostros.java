package pa.com.banistmo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.questions.VerificarSostenibilidad;
import pa.com.banistmo.tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDefinitionsAcercaDeNostros {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que ingreso a la pagina de Banistmo$")
    public void queIngresoALaPagina() {
        theActorCalled("Jonathan").wasAbleTo(AbrirPaginaBanistmo.banistmo());

    }

    @Cuando("ingreso a la seccion de acerca de nosotros")
    public void ingresoALaSeccionDeAcercaDeNosotros() {
        theActorInTheSpotlight().attemptsTo(
                IngresarAcercaDeNostros.deBanistmo()
        );
    }

    @Entonces("verifico que se muestre correctamente la pagina de sostenibilidad con el titulo (.*)$")
    public void verificoQueSeMuestreCorrectamenteLaPaginaDeSostenibilidadConElTitulo(String sostenibilidad) {

        theActorInTheSpotlight().should(seeThat(VerificarSostenibilidad.deBanistmo(sostenibilidad)));
    }
}
