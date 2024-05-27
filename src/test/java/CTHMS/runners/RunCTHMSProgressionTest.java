package CTHMS.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/CTHMS/features",
        glue = "CTHMS.steps",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        dryRun = false
)

public class RunCTHMSProgressionTest extends AbstractTestNGCucumberTests {
}
