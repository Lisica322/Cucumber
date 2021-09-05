package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class FirstGame {
    private SelenideElement firstPage = $x("//*[@class = 'carousel_thumbs']/*[position()<2]");
    private ElementsCollection firstPrice = $$("//div[@class='discount_block  no_discount']/*/*");
    private ElementsCollection firstGame = $$("//div[@class='main']//div[@class='bg']");
    private SelenideElement firstGamePrice = $x("//div[@class='game_purchase_action']//div[@class='game_purchase_price price']");


    @Given("Selection of the first item")
    public void clickFirstGamePage() {
        firstPage.click();
        WebElement firstGamePageMenuElementPrice =
                firstGame
                        .stream()
                        .findFirst()
                        .orElseThrow(() -> new AssertionError("Пустой список игр"));

        firstGamePageMenuElementPrice.click();


        WebElement finalePrice = null;
        for (int i = 0; i < firstPrice.size(); i++) {
            finalePrice = firstPrice.get(0);
        }

        assert finalePrice != null;
        String actualPageHeaderText = finalePrice.getText();

        Assertions.assertEquals(firstGamePrice.getText(), actualPageHeaderText.trim(), "Не совпадает цена в разделе с ценой на старнице игры!");
    }




}
