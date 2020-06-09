package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAllNews extends PageBase{
    public PageAllNews(WebDriver webDriver) {
        super(webDriver);
    }

    public void allNews(){
        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[2]/div[3]" +
                "/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/a[1]"),50);
        WebElement news = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]" +
                "/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/a[1]"));
        news.click();

        waitToBeVisible(By.xpath("//input[@placeholder='Период c']"),50);
        WebElement from = getWebDriver().findElement(By.xpath("//input[@placeholder='Период c']"));
        from.sendKeys("01072013");

        waitToBeVisible(By.xpath("//input[@placeholder='до']"),50);
        WebElement to = getWebDriver().findElement(By.xpath("//input[@placeholder='до']"));
        to.sendKeys("02072013");

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]" +
                "/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/button[1]"),50);
        WebElement add = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]" +
                "/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/button[1]"));
        add.click();
    }

    public boolean periodFrom(String data){


        String period = getWebDriver().getCurrentUrl();
        System.out.println("DATA: " + period);

        if (period.contains(data)){
            System.out.println("Отсчёт даты верен");
            return true;
        }else{
            System.out.println("Отсчёт даты не верен");
            return false;
        }
    }

    public String getPeriod(){

        String getData = getWebDriver().getCurrentUrl();
        System.out.println("Data contains: " + getData);

        return getData;
    }
}
