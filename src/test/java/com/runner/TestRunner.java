package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:FeatureFiles", 
				  glue="com.stepDefinitions",
				  dryRun = false,
				  tags="@reg",
				  monochrome = true)
public class TestRunner {

}
