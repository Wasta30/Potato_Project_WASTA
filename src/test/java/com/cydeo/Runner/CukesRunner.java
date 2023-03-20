package com.cydeo.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin ={   "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},

        features ="src/test/resources/features" ,
        glue = "com/cydeo/Step_Definitions",
        dryRun = false,
        tags = "@UPGNX10-227"

)

public class CukesRunner {
}