package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    //Локаторы через xPath
    private static final SelenideElement LOGIN_INPUT_BY = $(By.xpath(".//*[@name='j_username']"));
    private static final SelenideElement PASSWORD_INPUT_BY = $(By.xpath(".//*[@name='j_password']"));
    private static final SelenideElement LOGIN_BTN_BY = $(By.xpath(".//*[@type='submit' and @value='Login']"));
    //Локаторы через CSS
    private static final SelenideElement LOGIN_INPUT_CSS = $("input[name='j_username']");
    private static final SelenideElement PASSWORD_INPUT_CSS = $("input[name='j_password']");
    private static final SelenideElement LOGIN_BTN_CSS = $("input[type='submit']");

    protected void checkComponentIsLoaded() {
        System.out.println("Проверяем видимость элементов на странице LoginPage");
        LOGIN_INPUT_CSS.shouldBe(visible);
        PASSWORD_INPUT_CSS.shouldBe(visible);
        LOGIN_BTN_BY.shouldBe(visible);
        System.out.println("Элементы на странице LoginPage загружены");
    }

    public void inputLogin(String login) {
        System.out.println("Вводим login");
//        LOGIN_INPUT_BY.setValue(login);
        LOGIN_INPUT_CSS.setValue(login);
    }

    public void inputPassword(String password) {
        System.out.println("Вводим password");
//        PASSWORD_INPUT_BY.setValue(password);
        PASSWORD_INPUT_CSS.setValue(password);
    }

    public void clickByLoginBtn() {
        System.out.println("Нажимаем на кнопку Логин");
//        LOGIN_BTN_BY.click();
        LOGIN_BTN_BY.click();
        System.out.println("Кнопка Логин нажата");
    }

}
