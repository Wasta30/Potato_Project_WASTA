package com.cydeo.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "com/cydeo/Step_Definitions",
        features = "@target/rerun.txt" // so go to target and then go to rerun where we have our failed scenario and this way run our failed test


)

public class FailedTestRunner {




}
