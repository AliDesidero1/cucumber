package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        //tags = "@firstFeature and not @cucumber",
        tags = "@background",
        dryRun = false
)

public class FirstRunner {
}
