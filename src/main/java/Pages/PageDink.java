package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageDink  extends PageBase{
    public PageDink(WebDriver webDriver) {
        super(webDriver);
    }

    public void dinkDink(){

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/button[1]"),50);
        WebElement din = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/button[1]"));
        din.click();

        waitToBeClickable(By.xpath("//article[1]//div[2]//div[2]//a[1]"),50);
        WebElement about = getWebDriver().findElement(By.xpath("//article[1]//div[2]//div[2]//a[1]"));
        about.click();

        waitToBeVisible(By.xpath("//input[@id='subscription_email']"),50);
        WebElement eml = getWebDriver().findElement(By.xpath("//input[@id='subscription_email']"));
        eml.sendKeys("qgkg8@vmani.com");

        waitToBeClickable(By.cssSelector("div.jtn-ui--theme-orange:nth-child(6) div.global-wrapper:nth-child(2) " +
                "div.app-content div.AVeb.view div.columns-wrapper._" +
                "no-left-col div.inner-columns-wrapper div.central-right-wrapper div.central-column-container " +
                "div.C9cd form.DPst div.DPsv.DPsx label.KTatt.DPsz:nth-child(1) p.KTasf.KTatv > span.KTsz"),50);
        WebElement days = getWebDriver().findElement(By.cssSelector("div.jtn-ui--theme-orange:nth-child(6) div.global-wrapper:nth-child(2) " +
                "div.app-content div.AVeb.view div.columns-wrapper._no-left-col div.inner-columns-wrapper " +
                "div.central-right-wrapper div.central-column-container div.C9cd form.DPst div.DPsv.DPsx " +
                "label.KTatt.DPsz:nth-child(1) p.KTasf.KTatv > span.KTsz"));
        days.click();

        waitToBeClickable(By.cssSelector("div.jtn-ui--theme-orange:nth-child(6) div.global-wrapper:nth-child(2) div.app-content div.AVeb.view div.columns-wrapper._no-left-col " +
                "div.inner-columns-wrapper div.central-right-wrapper " +
                "div.central-column-container div.C9cd form.DPst div.DPsv.DPsx label.KTatt.DPsz:nth-child(2) " +
                "p.KTasf.KTatv > span.KTsz"),50);
        WebElement weeks = getWebDriver().findElement(By.cssSelector("div.jtn-ui--theme-orange:nth-child(6) div.global-wrapper:nth-child(2) div.app-content " +
                "div.AVeb.view div.columns-wrapper._no-left-col div.inner-columns-wrapper div.central-right-wrapper " +
                "div.central-column-container div.C9cd form.DPst div.DPsv.DPsx label.KTatt.DPsz:nth-child(2) " +
                "p.KTasf.KTatv > span.KTsz"));
        weeks.click();

        waitToBeClickable(By.cssSelector("div.jtn-ui--theme-orange:nth-child(6) div.global-wrapper:nth-child(2) div.app-content " +
                "div.AVeb.view div.columns-wrapper._no-left-col div.inner-columns-wrapper div.central-right-wrapper " +
                "div.central-column-container div.C9cd form.DPst div.DPsv.DPsx label.KTatt.DPsz:nth-child(3) " +
                "p.KTasf.KTatv > span.KTsz"),50);
        WebElement allcovid = getWebDriver().findElement(By.cssSelector("div.jtn-ui--theme-orange:nth-child(6) " +
                "div.global-wrapper:nth-child(2) div.app-content div.AVeb.view div.columns-wrapper._no-left-col" +
                " div.inner-columns-wrapper div.central-right-wrapper div.central-column-container " +
                "div.C9cd form.DPst div.DPsv.DPsx label.KTatt.DPsz:nth-child(3) p.KTasf.KTatv > span.KTsz"));
        allcovid.click();

        waitToBeClickable(By.xpath("//label[@id='user_agree']//span[@class='KTsz']"),50);
        WebElement Isocgl = getWebDriver().findElement(By.xpath("//label[@id='user_agree']//span[@class='KTsz']"));
        Isocgl.click();

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]" +
                "/div[1]/form[1]/button[1]"),50);
        WebElement podpis = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]" +
                "/div[1]/div[1]/div[1]/form[1]/button[1]"));
        podpis.click();
    }
}
