package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ContactsAnchorPage {
    @Step("Проверяем наличия блока 'Обратная связь'")
    public void checkContactsAnchorTest(String expectedText) {
        $(byText(expectedText)).scrollTo().shouldBe(visible);
    }

}
