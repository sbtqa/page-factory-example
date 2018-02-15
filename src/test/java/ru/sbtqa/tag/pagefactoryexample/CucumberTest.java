package ru.sbtqa.tag.pagefactoryexample;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.cucumber.TagCucumber;

/**
 *
 * @author sbt-svetlakov-av
 */
@RunWith(TagCucumber.class)
@CucumberOptions(
        glue = {"ru.sbtqa.tag.pagefactory.stepdefs", "ru.sbtqa.tag.pagefactoryexample.stepdefs"},
        features = {"src/test/resources/features/"},
        tags = {"@sports"})

public class CucumberTest {}