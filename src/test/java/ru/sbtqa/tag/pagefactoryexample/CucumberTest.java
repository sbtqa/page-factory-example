package ru.sbtqa.tag.pagefactoryexample;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.cucumber.TagCucumber;

/**
 *
 * @author sbt-svetlakov-av
 */
@RunWith(TagCucumber.class)
@CucumberOptions(monochrome = true, format = {"pretty"},
        glue = {"ru.sbtqa.tag.pagefactory.stepdefs", "ru.sbtqa.tag.pagefactory.htmlstepdefs"},
        features = {"src/test/resources/features"},
        tags = {"@gtest"})

public class CucumberTest {}