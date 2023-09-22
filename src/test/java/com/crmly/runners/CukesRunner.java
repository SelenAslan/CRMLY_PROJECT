package com.crmly.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue = "com/crmly/step_def",


 Gozde
        tags = "@GZD",

       


        dryRun = false


)

public class CukesRunner {

}
