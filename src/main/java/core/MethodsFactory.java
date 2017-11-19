package core;

import core.constants.WaitTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Stan on 07.06.2017.
 */
public class MethodsFactory {


    protected static WebDriver driver;

    public static WebDriver driver(){
        return driver;
    }

    public void get(String url){
        driver.get(url);
        getwebDriverWait(WaitTime.DEFAULT_ELEMENT_WAIT).until(CustomConditions.pageLoader());
    }

    protected WebDriverWait getwebDriverWait (long timeout){
        return new WebDriverWait(driver(),timeout);
    }


}
