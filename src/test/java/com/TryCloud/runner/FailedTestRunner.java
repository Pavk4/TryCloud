package com.TryCloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",

        // TODO Check the source folder

        glue = "com/TryCloud/step_definition"
)
public class FailedTestRunner {
}
