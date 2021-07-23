package questions;

import model.GoogleTraductorModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchCoursePage;
import userinterface.TraducirPalabraPage;

import java.util.List;

public class Traduccion implements Question<Boolean> {
    public List<GoogleTraductorModel> GoogleTraductorModel;

    public Traduccion(List<GoogleTraductorModel> googleTraductorModel) {
        GoogleTraductorModel = googleTraductorModel;
    }

    public static Traduccion deLa(List googleTraductorData) {
        return new Traduccion(googleTraductorData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String resultWord = Text.of(TraducirPalabraPage.TEXT2_INPUT).viewedBy(actor).asString().trim();
        System.out.println(resultWord);

        if (resultWord.equals(GoogleTraductorModel.get(0).getPalabra_esp())) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
