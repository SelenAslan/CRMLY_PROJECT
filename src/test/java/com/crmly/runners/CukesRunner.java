package com.crmly.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber-reports.json"
        },
        features = "src/test/resources",
        glue = "com/crmly/step_def",
        tags = "@REM-1892 ",
        dryRun = false

)

public class CukesRunner {
}
