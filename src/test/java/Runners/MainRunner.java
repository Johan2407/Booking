package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:Features"}, glue = {"StepDefinitions"},
        tags ="@Demo-auto" ,monochrome = true, dryRun = false)

public class MainRunner extends AbstractTestNGCucumberTests {
}
