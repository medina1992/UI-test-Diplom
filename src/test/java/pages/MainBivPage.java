package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainBivPage {


    private final SelenideElement aboutLink       = $("a[href='/#aboutAnchor']");
    private final SelenideElement directionsLink  = $("a[href='/#directionsAnchor']");
    private final SelenideElement technologiesLink = $("a[href='/#technologiesAnchor']");
    private final SelenideElement clientsLink     = $("a[href='/#clientsAnchor']");

    public static MainBivPage openPage() {
        open("https://bivgroup.ru/");
        return new MainBivPage();
    }

    public MainBivPage headerContainer(int expectedSize) {
        $$(".menu-top--list .menu-top--list-link")
                .shouldHave(CollectionCondition.size(expectedSize));
        return this;
    }

    public MainBivPage clickAbout() {
        aboutLink.click();
        return this;
    }

    public MainBivPage clickDirections() {
        directionsLink.click();
        return this;
    }

    public MainBivPage clickTechnologies() {
        technologiesLink.click();
        return this;
    }

    public MainBivPage clickClients() {
        clientsLink.click();
        return this;
    }
}
