package Tests;

import Pages.PageDink;
import Pages.PageSport;
import org.testng.annotations.Test;

public class TestDink extends TestBase {

    @Test()
    public void dink(){

        PageDink pageDink = new PageDink(getWebDriver());
        pageDink.closeWindow();
        pageDink.dinkDink();
    }
}
