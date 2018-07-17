package ru.sbtqa.tag.pagefactoryexample.pages.Google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory.annotations.RedirectsTo;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Image;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

@PageEntry(title = "Главная страница")
public class SearchPage extends Page {

    @ElementTitle("Найти")
    @FindBy(id = "lst-ib")
    public TextInput search;

    @ElementTitle("Логотип")
    @FindBy(id = "hplogo")
    public Image logo;

    @ElementTitle("Поиск в Google")
    @FindBy(name = "btnK")
    public Button searchAtGoogle;

    @ElementTitle("Поиск")
    @FindBy(name = "btnK")
    @RedirectsTo(page = ResultsPage.class)
    public WebElement searchLoupe;

    public SearchPage(){
        PageFactory.initElements(new HtmlElementDecorator(
                new HtmlElementLocatorFactory(PageFactory.getDriver())), this);
    }

    @ActionTitle("ищет")
    public void startSearching(String searchText){
        search.sendKeys(searchText);
        searchLoupe.click();
    }
}
