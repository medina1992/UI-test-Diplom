package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TechnologiesAnchorPage {
    @Step("Проверяем наличия блока 'Технологии'")
    public void checkTechnologiesAnchorPageTest(String expectedText) {
        $("#technologiesAnchor .section-title").shouldHave(text(expectedText));
    }
}
