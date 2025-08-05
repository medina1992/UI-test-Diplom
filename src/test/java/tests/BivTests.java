package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;


@Epic("Biv")
@Feature("Header")
@Story("Меню")
@Owner("medina")
@Severity(SeverityLevel.NORMAL)

@Tag("WEB")
@DisplayName("Тесты для BIVgroup ")
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
    @Tag("REGRESSION")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверяем количество кнопок в header меню")
    void startPageCheckHeaderContainerTest() {
        mainPage.headerContainer(7);
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Открываем страницу О компании и видим заголовок О компании")
    void aboutAnchorPageTest() {
        mainPage.clickAbout();
        aboutAnchorPage.checkAboutAnchorTextTest("О компании");
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Открываем страницу Направления и проверяем заголовок Направления")
    void directionsPageTest() {
        mainPage.clickDirections();
        directionsAnchorPage.checkDirectionsAnchorPageTest("Направления");
    }

    @Test
    @Tag("REGRESSION")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Открываем страницу Технологии и видим в заголовках Технологии")
    void productsPageTest() {
        mainPage.clickTechnologies();
        technologiesAnchorPage.checkTechnologiesAnchorPageTest("Технологии");
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Открываем страницу Клиенты и видим в заголовках Клиенты")
    void awardsPageTest() {
        mainPage.clickClients();
        clientsAnchorPage.checkClientsAnchorPageTest("Клиенты");

    }

    @Test
    @Tag("REGRESS")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Кликаем на 'Написать нам' и видим в заголовках 'Обратная связь'")
    void contactsPageTest() {
        mainPage.clickContactsAnchor();
        new ContactsAnchor().checkContactsAnchorTest("Обратная связь");

    }

    @Test
    @Tag("NEGATIVE")
    @Story("Негативный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка отправки формы 'Обратная связь' без заполнения полей")
    void unSuccessfulFormSendTest() {
        mainPage.clickSubmitFormBtn();
        mainPage.checkAllRequiredFieldErrors();
    }


}