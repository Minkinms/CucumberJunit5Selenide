package steps;

import dataForTest.users.Users;
import io.cucumber.java.en.Given;
import pages.LoginPage;
import tests.BaseTest;

import static tests.BaseTest.*;

public class CommonSteps extends BaseTest {

    @Given("Открываем стартовую страницу")
    public void openStartPageStep() {
        logCucumberStartStep("Открываем стартовую страницу");
        openStartPage();
        logCucumberStartEnd("Открываем стартовую страницу");
    }

}
