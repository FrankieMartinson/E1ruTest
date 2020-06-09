package Tests;

import Pages.PageAuto;
import Pages.PageLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuto extends TestBase{

    @Test(priority = 1)
    public void window() throws InterruptedException {

        PageAuto pageAuto = new PageAuto(getWebDriver());
        pageAuto.closeWindow();
        pageAuto.auto();

        Thread.sleep(5000);
        String testAuto = pageAuto.autoRu();
        Assert.assertEquals(testAuto,"Авто.ру");
    }
}
