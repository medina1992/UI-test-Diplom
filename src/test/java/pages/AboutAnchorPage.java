package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AboutAnchorPage {


    @Step("Проверяем наличия блока 'О компании'")
    public void checkAboutAnchorTextTest(String expectedText) {
        $("#aboutAnchor .section-title").shouldHave(text(expectedText));

    }
}