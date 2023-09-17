package tests;

import dataForTest.users.Users;
import config.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import pages.LoginPage;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static config.ProjectDataBase.ProjectURLs.PETSHOP_CRM_6;
import static messages.MessageTemplates.*;

public class BaseTest {


    public static void setDriver() {
        Driver.initChromeDriver(PETSHOP_CRM_6.getLocalURI());
        System.out.println("Настройка драйвера завершена");
    }

    @BeforeAll()
    public static void openStartPage() {
        setDriver();
        System.out.println("Открываем стартовую страницу");
        open(PETSHOP_CRM_6.getPath() + PETSHOP_CRM_6.getTargetPage());
    }

    @AfterAll
    public static void quiteDriver() {
        closeWebDriver();
    }

    public MainPage loginUser(Users user) {
        logMethod("Метод login");
        LoginPage loginPage = new LoginPage();
        loginPage.inputLogin(user.getLogin());
        loginPage.inputPassword(user.getPassword());
        loginPage.clickByLoginBtn();
        return new MainPage();
    }

    public static void logMethod(String message) {
        System.out.println(String.format(methodAction, message));
    }

    public static void logCucumberStartStep(String message) {
        System.out.println(String.format(cucumberStepStart, message));
    }

    public static void logCucumberStartEnd(String message) {
        System.out.println(String.format(cucumberStepEnd, message));
    }
}
