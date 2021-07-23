package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.TraductorGooglePage;

public class Ingresa implements Task {

    private TraductorGooglePage traductorGooglePage;

    public static Ingresa alTraductor() {
        return Tasks.instrumented(Ingresa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(traductorGooglePage));
    }
}
