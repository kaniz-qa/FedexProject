package fedex.runner;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = { "src/test/resources/Features" }, glue = { "fedex.stepDef",
		"fedex.utilities" }, plugin = { "pretty", "html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)




public class FedExRunner extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void generateExtentReport(){
		Reporter.loadXMLConfig(new File("config/config.xml"));
	}
	
}

