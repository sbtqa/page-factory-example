package ru.sbtqa.tag.pagefactoryexample.pages.Google;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.allurehelper.AllureNonCriticalFailure;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "Результаты")
public class ResultPage extends Page {

    @ElementTitle("Результаты")
    @FindBy(xpath = "//div[@class='misspell__message']")
    private WebElement results;

    public ResultPage(){
        PageFactory.initElements(PageFactory.getDriver(), this);
    }
    
    @ActionTitle("проверяет текст")
    public void waitt() throws InterruptedException {
        try {
            Assert.assertEquals("Другой текст", results.getText());
        } catch (AssertionError e) {
            AllureNonCriticalFailure.fire(e);
        }
    }

    @ActionTitle("проверяет еще что-то")
    public void waittt() throws InterruptedException {
        System.out.println("Test");
//        Assert.assertEquals("qwe", results.getText());
    }
}
