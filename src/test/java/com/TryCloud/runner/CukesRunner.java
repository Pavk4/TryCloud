package com.TryCloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        "rerun:target/rerun.txt"},

        features = "src/test/resources/features",
        glue = "com/TryCloud/step_definition",
        dryRun = false,
        tags = "@smoke1"
)
public class CukesRunner {

}

