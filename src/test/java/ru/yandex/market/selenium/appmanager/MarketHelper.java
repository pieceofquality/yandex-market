package ru.yandex.market.selenium.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by piece on 6/5/2017.
 */
public class MarketHelper extends HelperBase {

    public MarketHelper(WebDriver wd){

        super(wd);
    }


    public void defineFromPrice(String price) {
        type(By.cssSelector("#glf-pricefrom-var"), price);
    }

    public void defineBrand(String brand) {
        click(By.linkText(brand));
    }

    public void applyFilters() {
        click(By.cssSelector(".button_action_n-filter-apply"));
    }

    public void checkProductCardsAmount(int i) {
        Assert.assertEquals(i, wd.findElements(By.cssSelector(".n-snippet-card")).size());
    }

    public String firstProduct() {
       return wd.findElements(By.cssSelector(".snippet-card__header-text")).get(0).getText();
    }

    public void searchProduct(String product) {
        type(By.cssSelector("#header-search"), product);
        click(By.cssSelector(".button2_type_submit"));
    }

    public void checkProductCardTitle(String product) {
        String realProductName = wd.findElement(By.cssSelector("h1[itemprop='name']")).getText();
        Assert.assertEquals(product, realProductName);
    }
}
