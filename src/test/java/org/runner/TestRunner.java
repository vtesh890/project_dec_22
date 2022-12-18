package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\JDK\\eclipse_dec22\\Cucumber\\src\\test\\resources",glue="org.stepdefinition",dryRun=false,
//tags= {"~@smoke"})
tags= {"@smoke and @regression"})

public class TestRunner {


}