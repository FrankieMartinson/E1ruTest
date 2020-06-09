package Tests;

import Pages.PageAllNews;
import Pages.PageAuto;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAllNews extends TestBase {

    @Test(priority = 1)
    public void news(){

        PageAllNews pageAllNews = new PageAllNews(getWebDriver());
        pageAllNews.closeWindow();
        pageAllNews.allNews();
        //Assert.assertTrue(pageAllNews.periodFrom("2013"));

        String checkTwo = pageAllNews.getPeriod();
        Assert.assertEquals(checkTwo,"https://www.e1.ru/news/?dateFrom=01.07.2013&dateTo=02.07.2013");
    }
}
