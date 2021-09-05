package Pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$x;

public class Action {
    private SelenideElement pageHaeder = $x("//*[@class='pageheader']");


    @When("Check the Page Header")
    public void containsAction() {

        String actualPageHeaderText = pageHaeder.getText();
        Assertions.assertEquals("Просмотр по метке «Экшен»", actualPageHeaderText.trim(), "Не совпадает название раздела с заголовком!");
    }
}
