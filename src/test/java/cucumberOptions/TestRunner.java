package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "C:\\Java\\UIAutomation\\src\\test\\java\\features\\samplepageTest.feature",glue ="stepDefinitions",
monochrome=true,
plugin= {"html:target/cucumber.html", "json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//"rerun:target/failed_scenarios.txt//
})

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	
}
