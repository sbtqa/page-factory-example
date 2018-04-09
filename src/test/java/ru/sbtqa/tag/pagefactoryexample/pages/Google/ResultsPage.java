package ru.sbtqa.tag.pagefactoryexample.pages.Google;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import java.util.List;

@PageEntry(title = "Результаты поиска")
public class ResultsPage extends Page {

    @ElementTitle("Результаты поиска")
    @FindBy(xpath = "//div[@id='rso']//h3//a")
    private List<Link> results;

    public ResultsPage(){
        PageFactory.initElements(new HtmlElementDecorator(
                new HtmlElementLocatorFactory(PageFactory.getDriver())), this);
    }

    @ActionTitle("количество результатов поиска должно быть")
    public void checkResultCount(String resultCountString){
        int resultCount = Integer.parseInt(resultCountString);

        Assert.assertEquals("Incorrect count of search results", resultCount, results.size());
    }
}
