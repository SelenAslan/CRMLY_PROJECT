package com.crmly.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue = "com/crmly/step_def",


        tags = "@GZD",


        dryRun = true


)

public class CukesRunner {

}
