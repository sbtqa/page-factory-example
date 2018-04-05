package ru.sbtqa.tag.pagefactoryexample;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.cucumber.TagCucumber;

@RunWith(TagCucumber.class)
@CucumberOptions(monochrome = true, format = {"pretty"},
        glue = {"ru.sbtqa.tag.pagefactory.stepdefs"},
        features = {"src/test/resources/features/"})
public class CucumberTest {}