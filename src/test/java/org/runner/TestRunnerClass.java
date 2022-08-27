package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\lenovo\\eclipse-workspace\\Insurance\\src\\test\\resources",glue="org.stepdefinition",dryRun=true)

public class TestRunnerClass {

	
	
}
