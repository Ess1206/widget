package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

/**
 * Created by Stan on 07.06.2017.
 */
public class CustomConditions {

    public static ExpectedCondition pageLoader() {
        return new ExpectedCondition<Boolean>() {

            @Override
            public Boolean apply(WebDriver driver) {
                return JsExecuter.executeScript("return document.ready").equals("complete");
            }
        };

    }

}
