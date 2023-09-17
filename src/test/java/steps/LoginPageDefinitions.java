package steps;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import tests.BaseTest;

public class LoginPageDefinitions extends BaseTest {

    @Given("Ввести логин (.*)$")
    public void inputLogin(String loginUser) {
        logCucumberStartStep("Ввожу логин " + loginUser);
        LoginPage loginPage = new LoginPage();
        loginPage.inputLogin(loginUser);
        logCucumberStartEnd("Ввожу логин");
    }

    @Given("Ввести пароль (.*)$")
    public void inputPassword(String passwordUser) {
        logCucumberStartStep("Ввожу пароль " + passwordUser);
        LoginPage loginPage = new LoginPage();
        loginPage.inputPassword(passwordUser);
        logCucumberStartEnd("Ввожу пароль");
    }

    @Given("Нажать на кнопку Login")
    public void clickByLoginBtn() {
        logCucumberStartStep("Нажать на кнопку Login");
        LoginPage loginPage = new LoginPage();
        loginPage.clickByLoginBtn();
        logCucumberStartEnd("Нажать на кнопку Login");
    }
}
