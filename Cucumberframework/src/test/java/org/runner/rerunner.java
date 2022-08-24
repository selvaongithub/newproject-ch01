package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	//@CucumberOptions(features="Features",glue="org.stepdefni",plugin="rerun:@target/failedtestreport.txt")
@CucumberOptions(features="@target/failedtestreport.txt",glue="org.stepdefni",monochrome=true)

public class rerunner {

}
