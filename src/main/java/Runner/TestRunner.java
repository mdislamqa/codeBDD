package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="/Users/ripam/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/login.feature",
glue = {"StepDefinitions"},
format= {"pretty", "html:test-output", "json:json-output/cucumber.json","junit:junit_report/cucumber.xml"}
//monochrome=true,
//dryRun=false,
//strict=true

)
//{"pretty","json:target/report/json/output.json", "html:target/report/html"},
//tags="~@runthis")
/*
 * cucumber options are:
 * 1.dryRun=true(it will check which feature we did not implement on stepDefinition)
 * dryRun=false(it will skip the missing feature and run the application)
 * 
 * 2.feature(path of Feature file)
 * 3.glue(it will give a path of stepDefinition package/folder)
 * monochrome(display the console output in a proper readable format)
 * 4.strict=true(if any step is missing execution gets fail)
 */




public class TestRunner {

}
