package ru.sbtqa.tag.pagefactoryexample.pages.YandexMarket;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactoryexample.blocks.YandexMarket.HeaderBlock;
import ru.sbtqa.tag.pagefactoryexample.elements.YandexMarket.ProductCard;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import java.util.List;

@PageEntry(title = "Результаты поиска товаров")
public class YmSearchResultsPage extends Page {

    private HeaderBlock headerBlock;

    @ElementTitle("Список товаров")
    @FindBy(xpath = ".//div[contains(@class,'n-snippet-card2 ')]")
    private List<ProductCard> productCards;

    public YmSearchResultsPage(){
        PageFactory.initElements(
                new HtmlElementDecorator(new HtmlElementLocatorFactory(PageFactory.getDriver())), this);
    }


    @ActionTitle("проверяет присутствие продукта")
    public void compareProductCost(String productName){

        for (ProductCard card: productCards) {
            if(card.getProductName().toLowerCase().contains(productName.toLowerCase())){
                return;
            }
        }

        Assert.fail("Продукт " + productName +  " не был найден");
    }
}
