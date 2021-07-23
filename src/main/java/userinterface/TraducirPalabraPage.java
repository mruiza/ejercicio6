package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TraducirPalabraPage extends PageObject {
    public static final Target TEXT1_INPUT = Target.the("input to write the word in English").
            located(By.xpath("//div[@class='QFw9Te']//textarea[1]"));
    public static final Target TEXT2_INPUT = Target.the("input to show the word in Spanish").
            located(By.xpath("//div[@class='J0lOec']"));
}
