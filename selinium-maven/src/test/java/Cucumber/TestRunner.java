package Cucumber;

import io.cucumber.core.gherkin.Feature;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.awt.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources",
        glue = "Cucumber",
        tags = "@alltests",
        plugin = {"pretty", "html:target/my-files.html"},

        dryRun = true

)
public class TestRunner {

}
