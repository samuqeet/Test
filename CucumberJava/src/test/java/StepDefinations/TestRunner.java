package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.core.cli.Main;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
features={"src/test/resources/Features"},
glue= {"StepDefinations"},
plugin= {"pretty","html:reports/HTMLReports/Report.html", "rerun:target/failedrun.txt"},
tags="@smoketest",
monochrome=true
)
public class TestRunner {

	
}
