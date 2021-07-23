package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target UNIVERSITYCHOUCAIR_BUTTON = Target.the("button that shows the Choucair Academy Courses").
            located(By.xpath("//div[@id='universidad']//a[@class='card_index']"));
    public static final Target SEARCH_INPUT = Target.the("input to write of course name").
            located(By.xpath("//input[@id='coursesearchbox']"));
    public static final Target GO_BUTTON = Target.the("button that shows the results").
            located(By.xpath("//button[text()='Ir']"));
    public static final Target RESULTS_TABLE = Target.the("List of results ").
            located(By.xpath("//div[@class='search-results']//div[@class='result']"));
    public static final Target TITLECOURSE_LABEL = Target.the("course title").
            located(By.xpath("//div[@class='page-header-headings']//h1"));
}
