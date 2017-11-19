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

        driver.get("https://iz.ru/");

        Cookie ck1 = new Cookie("_io_widget:", "aaqpDPvdHDFi2jjfUwpapvtWJnsMmgSw");
        Cookie ck2 = new Cookie("__io_widget_introduced:", "true");
        driver.manage().addCookie(ck1);
        driver.manage().addCookie(ck2);

        driver.get("https://iz.ru/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());

        for (int i = 0; i<links.size(); i++)
        {
            System.out.println(links.get(i).getText());
        }
    }
}