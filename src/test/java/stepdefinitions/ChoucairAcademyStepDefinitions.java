package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Alejandra wants to learn automation at the academy Choucair$")
    public void thanAlejandraWantsToLearnAutomationAtTheAcademyChoucair() throws Exception {
        OnStage.theActorCalled("Alejandra").wasAbleTo(OpenUp.thePage(), (Login.OnThePage()));
    }

    @When("^she search for the course (.*) on the Choucair Academy Platform$")
    public void sheSearchForTheCourseConceptosGeneralesdeDevOpsOnTheChoucairAcademyPlatform(String Course) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(Course));
    }

    @Then("^she finds the course called (.*)$")
    public void sheFindsTheCourseCalledConceptosGeneralesdeDevOps(String question) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}