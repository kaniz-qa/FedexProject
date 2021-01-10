package fedex.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class FortFedexRunner {

	
	@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports",
			"json:target/cucumber-jsonreports/cucumber.json", 
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			features= {"src/test/resources/Features"}, glue= {"fedex.stepDef"},
			monochrome=true)

	public class RunCucumberTest extends AbstractTestNGCucumberTests{
	
		@BeforeClass
		public void setup() {
			
		}
		
		@AfterClass
		public void afterClass() {
			
		}
		
	}
}
