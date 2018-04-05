package ru.sbtqa.tag.pagefactoryexample.elements.YandexMarket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;

public class ProductCard extends TypifiedElement {

    private final String nameXpath = ".//div[@class='n-snippet-card2__title']/a";
    private final String costXpath = ".//div[@class='price']";

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
