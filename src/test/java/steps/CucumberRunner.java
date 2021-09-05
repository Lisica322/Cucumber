package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/StepByStep.feature",
        glue = "Pages",
        tags = "@all"
)
public class CucumberRunner {
}