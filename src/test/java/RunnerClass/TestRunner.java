package RunnerClass;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features= {"src\\test\\java\\FeatureFiles"},
        glue= {"StepDefinations"},
        plugin={"pretty:STDOUT","html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"},
        tags ="@smokeTest1"
)



public class TestRunner extends AbstractTestNGCucumberTests {


}