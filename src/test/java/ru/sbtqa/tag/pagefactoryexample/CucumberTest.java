package ru.sbtqa.tag.pagefactoryexample;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = {"pretty"},
        glue = {"ru.sbtqa.tag.stepdefs.ru"},
        features = {"src/test/resources/features/"}
        )
public class CucumberTest {}