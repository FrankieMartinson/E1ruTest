package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {

   private WebDriver webDriver = new ChromeDriver();


    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @BeforeTest
    public void beforeTest(){

        webDriver.get("https://www.e1.ru/");
    }
}
