package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.$x;

public class CategorySteamPage {
private SelenideElement pageMenu = $x("//*[@class = 'popup_body popup_menu_twocol_new']");

    @When("Check menu visibility")
    public void waitUntilPageMenuVisible() {
pageMenu.shouldBe(Condition.visible);
    }
}
