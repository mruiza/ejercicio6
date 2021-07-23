package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairAcademyLoginPage;

public class Login implements Task {
    public static Login OnThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairAcademyLoginPage.LOGIN_BUTTON),
                Enter.theValue("usuario").into(ChoucairAcademyLoginPage.USER_INPUT),
                Enter.theValue("contrasena").into(ChoucairAcademyLoginPage.PASSWORD_INPUT),
                Click.on(ChoucairAcademyLoginPage.SINGIN_BUTTON));
    }
}
