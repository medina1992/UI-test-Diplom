package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TechnologiesAnchorPage {
    public void checkTechnologiesAnchorPageTest(String expectedText) {
        $("#technologiesAnchor .section-title").shouldHave(text(expectedText));
    }
}
