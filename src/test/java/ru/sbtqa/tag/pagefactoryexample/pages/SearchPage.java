package ru.sbtqa.tag.pagefactoryexample.pages;

import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Image;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by sbt-svetlakov-av on 02.05.17.
 */
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
    public Button startSearching;

    public SearchPage(){
        PageFactory.initElements(PageFactory.getDriver(), this);
    }

    @ActionTitle("ищет")
    public void startSearching(String searchText){
        search.sendKeys(searchText);
        startSearching.click();
    }
}
