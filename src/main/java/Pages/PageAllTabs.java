package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class PageAllTabs extends PageBase{
    public PageAllTabs(WebDriver webDriver) {
        super(webDriver);
    }

    public void allTabs(){

        waitToBeVisible(By.xpath("/html[1]/body[1]/div[3]/div[2]/header[1]/div[1]/div[1]/ul[1]"),50);
        List <WebElement> allElements = getWebDriver().findElements(By.className("MVcl"));

        for(int i = 0; i <= 6; i++){
            System.out.println("All elements from line menu: " + allElements.get(i));
            allElements.get(i).click();
        }

    }

    public boolean checkRealty(int size) throws InterruptedException {

        //Получение спсика вкладок браузера
        List <String> tabs = new ArrayList(getWebDriver().getWindowHandles());
        System.out.println(" Tabs size " + tabs.size());


        if(tabs.size() == size){
            System.out.println("Размер верен");
            return true;
        }else
            System.out.println("Размер не верен");
        return false;
    }
}
