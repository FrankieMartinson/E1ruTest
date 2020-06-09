package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAuto extends PageBase{
    public PageAuto(WebDriver webDriver) {
        super(webDriver);
    }

    public void auto(){

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[1]"),50);
        WebElement auto = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[1]"));
        auto.click();

        waitToBeVisible(By.id("confirm-button"),50);
        WebElement accept = getWebDriver().findElement(By.id("confirm-button"));
        accept.click();

        waitToBeClickable(By.xpath("//div[@class='Modal Modal_visible Modal_has-animation']//div[@class='Modal__closer']//*[local-name()='svg']"),50);
        WebElement clWin = getWebDriver().findElement(By.xpath("//div[@class='Modal Modal_visible Modal_has-animation']//div[@class='Modal__closer']//*[local-name()='svg']"));
        clWin.click();
    }

    public String autoRu(){

        waitToBeVisible(By.xpath("//a[@class='HeaderLogoLink']"),50);
        WebElement auto = getWebDriver().findElement(By.xpath("//a[@class='HeaderLogoLink']"));
        String getAuto = auto.getText();

        return getAuto;
    }
}
