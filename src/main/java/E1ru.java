import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E1ru {

    public static void main(String[] args) throws InterruptedException{

        int time = 5;

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.e1.ru/");

        /*Начало логирования*/
        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.id("onesignal-popover-cancel-button")));
        WebElement closeWindow = driver.findElementById("onesignal-popover-cancel-button");
        closeWindow.click();

        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/a[1]")));
        WebElement entry = driver.findElementByXPath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[2]/a[1]");
        entry.click();

        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='auth_login']")));
        WebElement eml = driver.findElementByXPath("//input[@id='auth_login']");
        eml.sendKeys("donigi6298@2go-mail.com");

        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='auth_password']")));
        WebElement pass = driver.findElementByXPath("//input[@id='auth_password']");
        pass.sendKeys("Atos2011");

        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]")));
        WebElement signIN = driver.findElementByXPath("/html[1]/body[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]");
        signIN.click();
        /*Конец логирования*/

        /*гамбургер + спорт*/
        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.jtn-ui--theme-orange:nth-child(6) div.global-wrapper:nth-child(2) header.Nbt.app-header div.HPagf div.HPagh div.HPbv ul.HZagv.HZagx li.HZc3:nth-child(3) div.HVagp div.HVagr > button.JHkv.JHapv.menu-btn")));
        WebElement hamburger = driver.findElementByCssSelector("div.jtn-ui--theme-orange:nth-child(6) div.global-wrapper:nth-child(2) header.Nbt.app-header div.HPagf div.HPagh div.HPbv ul.HZagv.HZagx li.HZc3:nth-child(3) div.HVagp div.HVagr > button.JHkv.JHapv.menu-btn");
        Thread.sleep(10000);
        hamburger.click();

        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[23]//a[1]")));
        WebElement sport = driver.findElementByXPath("//li[23]//a[1]");
        sport.click();
        /*гамбургер + спорт*/

        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='JPcp']")));
        WebElement back = driver.findElementByXPath("//div[@class='JPcp']");
        back.click();

        /*поиск начало*/
        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/button[1]/*[local-name()='svg'][1]")));
        WebElement search = driver.findElementByXPath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/button[1]/*[local-name()='svg'][1]");
        search.click();

        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Введите слово для поиска']")));
        WebElement sendText = driver.findElementByXPath("//input[@placeholder='Введите слово для поиска']");
        sendText.sendKeys("Как жить?");

        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/form[1]/div[1]/button[1]/*[local-name()='svg'][1]")));
        WebElement clickSearch = driver.findElementByXPath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/form[1]/div[1]/button[1]/*[local-name()='svg'][1]");
        clickSearch.click();
        /*поиск конец*/

        new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Lbt']//li[1]//a[1]")));
        WebElement cars = driver.findElementByXPath("//div[@class='Lbt']//li[1]//a[1]");
        cars.click();
    }
}
