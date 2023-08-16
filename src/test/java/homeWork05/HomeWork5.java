package homeWork05;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork5 {
    @Test
    void solutionEnterprize() {
        //Открыть gitHub
        open("https://github.com");

        //Open Solutions -> Enterprize with hover
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();

        //Open page (exp. - "Build like the best.")
       $(".enterprise-hero h1").shouldHave(text("Build like the best"));
    }

}
