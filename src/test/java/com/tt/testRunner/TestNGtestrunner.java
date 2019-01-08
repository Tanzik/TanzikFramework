package com.tt.testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Features"},
		glue = {"com.tt.testRunner"}
		)

public class TestNGtestrunner extends AbstractTestNGCucumberTests{

}
