package ru.sbtqa.tag.pagefactoryexample.blocks.YandexMarket;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.maven_artefacts.module_pagefactory_api.annotations.ActionTitle;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by sbt-svetlakov-av on 12.05.17.
 */
@Name("Меню поиска")
@FindBy(xpath = "//div[@class='header2__main']")
public class HeaderBlock extends HtmlElement{

    @Name("Строка поиска")
    @FindBy(xpath = "//input[@id='header-search']")
    public TextInput searchString;

    @Name("Найти")
    @FindBy(xpath = "//span[text()='Найти']")
    public TextInput searchButton;

    @ActionTitle("выполняет поиск")
    public void startSearch(String text){
        searchString.sendKeys(text);
        searchString.sendKeys(Keys.ENTER);
    }
}
