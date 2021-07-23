package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Select implements Interaction {

    private Target table;
    private String option;

    public Select(Target table, String option) {
        this.table = table;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listCourse = (List<WebElement>) table.resolveFor(actor).findElements(By.tagName("a"));
        for (int i=0; i<listCourse.size(); i++){
            if (listCourse.get(i).getText().equals(option)){
                System.out.println(listCourse.get(i).getText());
                listCourse.get(i).click();
                break;
            }
        }
    }
    public static Select theCourse(Target table, String option){
        return new Select(table, option);
    }
}
