package config;


import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

/*@CucumberOptions(
        features = "src/test/features",
        glue = "ru.savkk.test",
        tags = "@all",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE,
//        name = "^Успешное|Успешная.*"
)*/
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")    //путь для сценариев
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps")  //Путь для определений шагов
public class CucumberRunnerTest {

}
