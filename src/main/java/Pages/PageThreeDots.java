package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageThreeDots extends PageBase{
    public PageThreeDots(WebDriver webDriver) {
        super(webDriver);
    }

    public void dots(){

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]" +
                "/div[1]/button[1]/*[local-name()='svg'][1]"),50);
        WebElement dot = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]" +
                "/div[1]/div[1]/button[1]/*[local-name()='svg'][1]"));
        dot.click();

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]"),50);
        WebElement covid = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]"));
        covid.click();
    }
}
