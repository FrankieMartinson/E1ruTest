package Tests;

import Pages.PageLogin;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends TestBase{


    @Test(priority = 1)
    public void window(){

        //Assert.equals()
        //Assert.false()
        //Assert.true()
        //в каждом тесте по 3 ассерта + выбирать на каждый ассерт новый способ проверки

        PageLogin pageLogin = new PageLogin(getWebDriver());
        pageLogin.closeWindow();
        pageLogin.login();
        Assert.assertTrue(pageLogin.checkEml("Yannay"));
        Assert.assertFalse(pageLogin.name("Люся"));

        String check = pageLogin.checkGender();
        Assert.assertEquals(check,"Мужской");
       /* System.out.println(pageLogin.checkEml("donigi6298@2go-mail.com"));

        boolean bll = pageLogin.checkEml("donigi6298@2go-mail.com");
        System.out.println(bll);*/

    }

}
