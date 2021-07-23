package tasks;

import model.GoogleTraductorModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.TraducirPalabraPage;

import java.util.List;

public class Traducir implements Task {

    private List<GoogleTraductorModel> googleTraductorData;

    public Traducir(List<GoogleTraductorModel> googleTraductorData) {
        this.googleTraductorData = googleTraductorData;
    }

    public static Traducir deInglesAEspañol(List<GoogleTraductorModel> googleTraductorData) {
        return Tasks.instrumented(Traducir.class, googleTraductorData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo (Enter.theValue(googleTraductorData.get(0).getPalabra()).into(TraducirPalabraPage.TEXT1_INPUT));
    }
}
