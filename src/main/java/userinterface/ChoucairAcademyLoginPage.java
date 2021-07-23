package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairAcademyLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").
            located(By.xpath("//a[contains(@href,'contactenos')]//following::li[1]"));
    public static final Target USER_INPUT = Target.the("input to write the user").
            located(By.xpath("//input[@id='username']"));
    public static final Target PASSWORD_INPUT = Target.the("input to write the password").
            located(By.xpath("//input[@id='password']"));
    public static final Target SINGIN_BUTTON = Target.the("button that shows the Choucair Academy Menu").
            located(By.xpath("//button[text()='Acceder']"));
}
