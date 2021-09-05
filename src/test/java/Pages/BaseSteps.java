package Pages;

import com.codeborne.selenide.Selenide;
import contants.SteamUrls;
import io.cucumber.java.en.Given;

import java.util.HashMap;
import java.util.Map;

public class BaseSteps {

    public static Map<String, Object> container = new HashMap<>();

    @Given("Open the page {string}")
    public void openPage(String url) {
        Selenide.open(SteamUrls.BASE_URL.getBaseUrl());
        container.put("param1", "value");
    }
}
