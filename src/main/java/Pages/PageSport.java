package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageSport extends PageBase{

    public PageSport(WebDriver webDriver) {
        super(webDriver);
    }

    public void menuSport(){

        waitToBeClickable(By.xpath("//body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]" +
                "/button[1]/*[local-name()='svg'][1]/*[name()='use'][1]"),50);

        WebElement hamburger = getWebDriver().findElement(By.xpath("//body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[3]" +
                "/div[1]/div[1]/button[1]/*[local-name()='svg'][1]/*[name()='use'][1]"));
        hamburger.click();

        waitToBeClickable(By.xpath("//li[23]//a[1]"),50);
        WebElement sport = getWebDriver().findElement(By.xpath("//li[23]//a[1]"));
        sport.click();

        waitToBeClickable(By.xpath("//div[@class='JNbz']"),50);
        WebElement back = getWebDriver().findElement(By.xpath("//div[@class='JNbz']"));
        back.click();


        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]" +
                "/ul[1]/li[2]/div[1]/div[1]/button[1]/*[local-name()='svg'][1]"),50);
        WebElement search =  getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]" +
                "/ul[1]/li[2]/div[1]/div[1]/button[1]/*[local-name()='svg'][1]"));
        search.click();


        waitToBeClickable(By.xpath("//input[@placeholder='Введите слово для поиска']"),50);
        WebElement sendText = getWebDriver().findElement(By.xpath("//input[@placeholder='Введите слово для поиска']"));
        sendText.sendKeys("Как жить?");

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/form[1]" +
                "/div[1]/button[1]/*[local-name()='svg'][1]"),50);

        WebElement clickSearch = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/form[1]" +
                "/div[1]/button[1]/*[local-name()='svg'][1]"));
        clickSearch.click();

    }
}
