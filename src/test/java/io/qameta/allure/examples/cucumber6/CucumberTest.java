package io.qameta.allure.examples.cucumber6;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "progress",
                "summary"
        }
)
public class CucumberTest extends AbstractTestNGCucumberTests {
}
