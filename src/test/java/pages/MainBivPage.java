package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainBivPage {
    private final SelenideElement
            aboutLink = $("a[href='/#aboutAnchor']"),
            directionsLink = $("a[href='/#directionsAnchor']"),
            technologiesLink = $("a[href='/#technologiesAnchor']"),
            clientsLink = $("a[href='/#clientsAnchor']"),
            contactsAnchor = $("a[href='/#contactsAnchor']"),
            submitFormBtn = $("button[type='submit']");
    private final ElementsCollection errorMessagesForField = $$(".error-text");

    @Step("Открываем главную страницу")
    public static MainBivPage openPage() {
        open("https://bivgroup.ru/");
        return new MainBivPage();
    }

    @Step("Проверяем верное количество видимых вкладок в заголовке")
    public MainBivPage headerContainer(int expectedSize) {
        $$(".menu-top--list .menu-top--list-link")
                .shouldHave(CollectionCondition.size(expectedSize));
        return this;
    }

    @Step("Проверяем наличия блока 'О компании'")
    public MainBivPage clickAbout() {
        aboutLink.click();
        return this;
    }

    @Step("Проверяем наличия блока 'Направления'")
    public MainBivPage clickDirections() {
        directionsLink.click();
        return this;
    }

    @Step("Проверяем наличия блока 'Технологии'")
    public MainBivPage clickTechnologies() {
        technologiesLink.click();
        return this;
    }

    @Step("Проверяем наличия блока 'Клиенты'")
    public MainBivPage clickClients() {
        clientsLink.click();
        return this;
    }

    @Step("Проверяем наличия блока 'Обратная связь'")
    public MainBivPage clickContactsAnchor() {
        contactsAnchor.click();
        return this;
    }

    @Step("Нажимаем на кнопку 'Отправить'")
    public void clickSubmitFormBtn() {
        submitFormBtn.scrollTo().click();
    }


    @Step("Проверяем сообщения об ошибках для всех обязательных полей")
    public void checkAllRequiredFieldErrors() {
        errorMessagesForField.findBy(text("Введите имя")).shouldBe(visible);
        errorMessagesForField.findBy(text("Введите номер телефона")).shouldBe(visible);
        errorMessagesForField.findBy(text("Введите E-mail")).shouldBe(visible);
        errorMessagesForField.findBy(text("Введите сообщение")).shouldBe(visible);
        errorMessagesForField.findBy(text("Дайте согласие")).shouldBe(visible);
    }

}
