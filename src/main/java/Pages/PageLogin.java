package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PageLogin extends PageBase{

    public PageLogin(WebDriver webDriver) {
        super(webDriver);
        //super() - Вызов конструктора родителя в конструкторе ребнёнка
    }


    public void login(){

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/a[1]"),120);
        WebElement entry = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/a[1]"));
        entry.click();

        waitToBeVisible(By.xpath("//input[@id='auth_login']"),120);
        WebElement eml = getWebDriver().findElement(By.xpath("//input[@id='auth_login']"));
        eml.sendKeys("donigi6298@2go-mail.com");

        waitToBeVisible(By.xpath("//input[@id='auth_password']"),120);
        WebElement pass = getWebDriver().findElement(By.xpath("//input[@id='auth_password']"));
        pass.sendKeys("Atos2011");

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]"),120);
        WebElement signIN = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]"));
        signIN.click();
    }

    public boolean checkEml(String email){

        waitToBeVisible(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/div[1]/a[1]/span[1]"),50);
        WebElement eml = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/div[1]/a[1]/span[1]"));

        String getEm = eml.getText();

        if(getEm.equals(email)){
            System.out.println("Логин опознан");
            return true;
        }else
            System.out.println("Логин не опознан");
            return false;

    }

    public boolean name(String fullName){
        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/div[1]/a[1]/span[1]"),50);
        WebElement yan = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/div[1]/a[1]/span[1]"));
        yan.click();

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"),50);
        WebElement profile = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
        profile.click();

        waitToBeVisible(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/h3[1]"),50);
        WebElement name = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/h3[1]"));

        String getName = name.getText();

        if (getName.equals(fullName)){
            System.out.println("Правильное имя");
            return true;
        }else
            System.out.println("Ложное имя");
            return false;
    }

    public String checkGender(){

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/div[1]/a[1]/span[1]"),50);
        WebElement yan = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/div[1]/a[1]/span[1]"));
        yan.click();

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"),50);
        WebElement profile = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
        profile.click();

        waitToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]"),50);
        WebElement settingProfile = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]"));
        settingProfile.click();

        waitToBeVisible(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/label[1]/span[1]"),50);
        WebElement gen = getWebDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/label[1]/span[1]"));

        String getGender = gen.getText();

        System.out.println("Поздравляю, вы мужик");
        return getGender;

    }
}
