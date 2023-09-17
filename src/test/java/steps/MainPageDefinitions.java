package steps;

import dataForTest.users.Users;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.MainPage;
import tests.BaseTest;

public class MainPageDefinitions extends BaseTest {

    @Then("Главная страница должна быть загружена")
    public void mainPageIsLoaded() {
        logCucumberStartStep("Главная страница должна быть загружена");
        MainPage mainPage = new MainPage();
        Assertions.assertTrue(mainPage.pageIsLoaded(), "Главная страница не загружена");
        logCucumberStartEnd("Главная страница должна быть загружена");
    }

}
