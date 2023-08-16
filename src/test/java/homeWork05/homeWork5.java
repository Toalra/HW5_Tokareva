package homeWork05;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class homeWork5 {
    @Test
    void SolutionEnterprize() throws  InterruptedException{
        //Открыть gitHub
        open("https://github.com");

        //Открыть меню Solutions -> Enterprize с помощью команды hover для Solutions
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();

        //Убедитесь, что загрузилась нужная страница (например что заголовок - "Build like the best."
       $(".enterprise-hero h1").shouldHave(text("Build like the best"));
    }

}
