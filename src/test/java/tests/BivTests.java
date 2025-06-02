package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("Biv")
public class BivTests extends TestBase {

    private MainBivPage mainPage;
    private AboutAnchorPage aboutAnchorPage;
    private ClientsAnchorPage clientsAnchorPage;
    private DirectionsAnchorPage directionsAnchorPage;
    private TechnologiesAnchorPage technologiesAnchorPage;

    private static final int HEADER_BUTTONS_COUNT = 7;

    @BeforeEach
    public void setUp() {

        mainPage = MainBivPage.openPage();

        aboutAnchorPage = new AboutAnchorPage();
        clientsAnchorPage = new ClientsAnchorPage();
        directionsAnchorPage = new DirectionsAnchorPage();
        technologiesAnchorPage = new TechnologiesAnchorPage();
    }

    @Test
    @DisplayName("1. Проверяем количество кнопок в header меню")
    void startPageCheckHeaderContainerTest() {
        mainPage.headerContainer(7);
    }

    @Test
    @DisplayName("2. Открываем страницу О компании и видим заголовок О компании")
    void aboutAnchorPageTest() {
        mainPage.clickAbout();
        aboutAnchorPage.checkAboutAnchorTextTest("О компании");
    }

    @Test
    @DisplayName("3. Открываем страницу Направления и проверяем заголовок Направления")
    void contactsPageTest() {
        mainPage.clickDirections();
        directionsAnchorPage.checkDirectionsAnchorPageTest("Направления");
    }

    @Test
    @DisplayName("4. Открываем страницу Технологии и видим в заголовках Технологии")
    void productsPageTest() {
        mainPage.clickTechnologies();
        technologiesAnchorPage.checkTechnologiesAnchorPageTest("Технологии");
    }

    @Test
    @DisplayName("5. Открываем страницу Клиенты и видим в заголовках Клиенты")
    void awardsPageTest() {
        mainPage.clickClients();
        clientsAnchorPage.checkClientsAnchorPageTest("Клиенты");

    }
}