package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DirectionsAnchorPage {
    @Step("Проверяем наличия блока 'Направления'")
    public void checkDirectionsAnchorPageTest(String expectedText) {
        $("#directionsAnchor .section-title").shouldHave(text(expectedText));
    }
}
