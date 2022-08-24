package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="org.stepdefni",plugin="rerun:target/failedtestreport.txt")
//@CucumberOptions(features = "Features",glue = "org.stepdefni",plugin = "json:target/report")
//@CucumberOptions(features = "Features",glue = "org.stepdefni",plugin = "html:src/test/resources/report.html",dryRun = true)//to create html report
//@CucumberOptions(features = "Features",glue = "org.stepdefni",strict = true)//any error test case will give fail

//@CucumberOptions(features = "Features",glue = "org.stepdefni",monochrome = false) //monochrome will give formated output in console
//@CucumberOptions(features = "Features",glue = "org.stepdefni",dryRun = true)//find missing steps
//@CucumberOptions(features = "Features",glue = "org.stepdefni") //to run multiple features by providing 
//feature file folder name and package name 

public class runner {

}
