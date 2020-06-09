package Tests;

import Pages.PageSport;
import Pages.PageThreeDots;
import org.testng.annotations.Test;

public class TestThreeDots extends TestBase{

    @Test()
    public void threeDots(){

        PageThreeDots pageThreeDots = new PageThreeDots(getWebDriver());
        pageThreeDots.closeWindow();
        pageThreeDots.dots();
    }
}
