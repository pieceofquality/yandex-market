package ru.yandex.market.selenium.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;

    private MarketHelper marketHelper;
    private String browser;
    private NavigationHelper navigationHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() throws IOException {
        if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            wd = new ChromeDriver(options);
        } else if (browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        } else if (browser.equals(BrowserType.EDGE)){
            wd = new EdgeDriver();
        }

        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://yandex.ru");
        marketHelper = new MarketHelper(wd);
        navigationHelper = new NavigationHelper(wd);

    }

    public void stop() {
        wd.quit();
    }


    public MarketHelper getMarketHelper() {
        return marketHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
