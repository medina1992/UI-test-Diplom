package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ClientsAnchorPage {

    @Step("Проверяем наличия блока 'Клиенты'")
    public void checkClientsAnchorPageTest(String expectedText) {
        $("#clientsAnchor .section-title").shouldHave(text(expectedText));
    }
}