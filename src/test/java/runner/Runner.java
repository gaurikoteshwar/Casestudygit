package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\CaseStudies",glue="casestudies",
plugin="json:target\\jsonreport")

public class Runner {

}
