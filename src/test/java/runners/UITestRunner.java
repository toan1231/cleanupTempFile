package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"html:target/cucumber.html","json:target/cucumber.json"},
        features = "src/test/resources/uiFeatures",
        glue = "ui_automation/step_definitions",
        tags = "@ning",
        dryRun=false

)
public class UITestRunner {

}
