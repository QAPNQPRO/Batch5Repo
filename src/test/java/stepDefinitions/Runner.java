package stepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		monochrome = true,
		features = {"src/test/java/features"},
		glue = {"stepDefinitions"},
		tags="@F2 and @smoke or @sanity",
		plugin = {"html:target/cucumber.html","json:target/cucumber.json"}
		)
public class Runner extends AbstractTestNGCucumberTests{

}
