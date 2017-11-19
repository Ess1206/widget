import Report.CreateHtmlDocument;
import core.BrowserFactory;

import org.apache.http.cookie.SetCookie;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FindAllLinks extends BrowserFactory{

    @Test
    public void SearchAll() {

        //driver.get("https://iz.ru/");
        driver.get("https://google.com/");


        Cookie ck1 = new Cookie("_io_widget:", "aaqpDPvdHDFi2jjfUwpapvtWJnsMmgSw");
        Cookie ck2 = new Cookie("_io_widget_introduced:", "true");
        driver().manage().addCookie(ck1);
        driver().manage().addCookie(ck2);

       // driver.navigate().refresh();

        List<WebElement> links = driver.findElements(By.tagName("a"));

        int linksCount = links.size();
        System.out.println(linksCount);

        for (int i = 0; i<linksCount; i++)
        {
            System.out.println(links.get(i).getText());
            CreateHtmlDocument.AddLinkToReport(i , links.get(i).getText(), false);
        }
        CreateHtmlDocument.GenerateReport();
        System.out.println("End");
    }
}