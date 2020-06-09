package Tests;

import Pages.PageLogin;
import Pages.PageSport;
import org.testng.annotations.Test;

public class TestSport extends TestBase{

    @Test()
    public void sport(){

        PageSport pageSport = new PageSport(getWebDriver());
        pageSport.closeWindow();
        pageSport.menuSport();
    }

}
