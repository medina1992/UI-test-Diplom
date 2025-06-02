package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AboutAnchorPage {


    public void checkAboutAnchorTextTest(String expectedText) {
        $("#aboutAnchor .section-title").shouldHave(text(expectedText));

    }
}