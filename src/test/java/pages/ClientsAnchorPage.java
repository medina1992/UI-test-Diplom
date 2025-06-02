package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ClientsAnchorPage {
    public void checkClientsAnchorPageTest(String expectedText) {
        $("#clientsAnchor .section-title").shouldHave(text(expectedText));
    }
}