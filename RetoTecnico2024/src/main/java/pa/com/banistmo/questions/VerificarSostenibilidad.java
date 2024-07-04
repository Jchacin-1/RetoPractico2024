package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.userinterface.SostenibilidadUserInterface;

public class VerificarSostenibilidad implements Question<Boolean> {

    private String sostenibilidad;


    public VerificarSostenibilidad(String sostenibilidad) {
        this.sostenibilidad = sostenibilidad;
    }

    public static VerificarSostenibilidad deBanistmo(String sostenibilidad){
        return new VerificarSostenibilidad(sostenibilidad);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return Text.of(SostenibilidadUserInterface.H1_SOSTENIBILIDAD)
                .answeredBy(actor)
                .equals(sostenibilidad);
    }
}
