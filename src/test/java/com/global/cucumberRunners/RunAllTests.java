package com.global.cucumberRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "junit:target/cucumber-report/tests.xml"},
        features = "/home/yanisimova/IdeaProjects/test-global/src/test/resources/com/global",
        glue = "classpath:com/global/steps")

public class RunAllTests {
}
