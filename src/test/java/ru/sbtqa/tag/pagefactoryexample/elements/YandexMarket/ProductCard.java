package ru.sbtqa.tag.pagefactoryexample.elements.YandexMarket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;

/**
 * Created by sbt-svetlakov-av on 12.05.17.
 */
public class ProductCard extends TypifiedElement {

    private String nameXpath = ".//span[contains(@class,'header-text')]";
    private String costXpath = ".//div[@class='price']";

    public ProductCard(WebElement wrappedElement) {
        super(wrappedElement);
    }

    public String getProductName(){
        String name = getWrappedElement()
                .findElement(By.xpath(nameXpath))
                .getText();
        return name;
    }

    public Integer getMinCost(){
        String costString = getWrappedElement()
                .findElement(By.xpath(costXpath))
                .getText()
                .replace(' ', Character.MIN_VALUE)
                .replace("руб.","")
                .substring(2);

        return Integer.parseInt(costString);
    }
}
