package Tests;

import Pages.PageAllTabs;
import Pages.PageAuto;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestAllTabs extends TestBase {

    PageAllTabs pageAllTabs = new PageAllTabs(getWebDriver());

    @Test()
    public void allWindow(){
        pageAllTabs.closeWindow();
        pageAllTabs.allTabs();

    }

    @AfterMethod
    public void allAsserts() throws InterruptedException {

        //Assert.assertTrue(pageAllTabs.checkRealty(8));

    }
}
