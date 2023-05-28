package com.test.automation.runner;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", 
          tags = "@test_1", 
          glue = "com.test.automation.stepDefinitions", 
          snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}