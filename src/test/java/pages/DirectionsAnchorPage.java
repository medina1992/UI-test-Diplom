package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DirectionsAnchorPage {
    public void checkDirectionsAnchorPageTest(String expectedText) {
        $("#directionsAnchor .section-title").shouldHave(text(expectedText));
    }
}
