package ru.yandex.market.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToDrafts() {
        click(By.xpath("//span[.='Черновики']"));
    }

    public void goToSent() {
        click(By.xpath("//span[.='Отправленные']"));
    }

    public void goToMarket() {
        click(By.cssSelector("[data-id='market']"));
    }

    public void goToElectronics() {
        click(By.cssSelector("[data-department='Электроника']"));
    }

    public void goToTVPanels() {
        click(By.linkText("Телевизоры"));
    }

    public void goToEarphones() {
        click(By.linkText("Наушники и Bluetooth-гарнитуры"));
    }
}
