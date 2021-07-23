package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.GoogleTraductorModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import questions.Traduccion;
import tasks.*;

import java.util.List;

public class GoogleTraductorStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Alejandra quiere usar el traductor de Google$")
    public void queAlejandraQuiereUsarElTraductorDeGoogle() throws Exception {
        OnStage.theActorCalled("Alejandra").wasAbleTo(Ingresa.alTraductor());
    }

    @When("^ella traduce una palabra de ingles a español$")
    public void ellaTraduceUnaPalabraDeInglesAEspañol(List<GoogleTraductorModel> GoogleTraductorData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Traducir.deInglesAEspañol(GoogleTraductorData));
    }

    @Then("^el deberia ver la palabra traducida del idioma origen a idioma destino$")
    public void elDeberiaVerLaPalabraTraducidaDelIdiomaOrigenAIdiomaDestino(List<GoogleTraductorModel> GoogleTraductorData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Traduccion.deLa(GoogleTraductorData)));

    }
}
