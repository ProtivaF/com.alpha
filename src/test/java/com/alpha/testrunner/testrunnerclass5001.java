  package com.alpha.testrunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.alpha.Utility.Baseclass5001;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/test/resource/featureee"} , 
plugin = {"json:target/cucumber.json"},
//glue = "Stepdefination",tags= {"@ContactTest"})
//glue = "Stepdefination",tags = {"@signup"})
  glue = "Stepdefination",tags = {"@login"})
public class testrunnerclass5001 extends AbstractTestNGCucumberTests{
	
    @BeforeTest
	public void startURL() {
    	Baseclass5001 test = new Baseclass5001();
		test.initBrowser();
	}
    @AfterTest
	public void closeURL() {
    	Baseclass5001 test = new Baseclass5001();
		test.driver.quit();
	
    	
  }
}
