package ru.sbtqa.tag.pagefactoryexample.pages.Google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "Йару")
public class YaPage extends Page {

    @ElementTitle("Найти")
    @FindBy(xpath = "//span[text()='Найти']/parent::button")
    private WebElement search;

    public YaPage(){
        PageFactory.initElements(PageFactory.getDriver(), this);
    }

}
