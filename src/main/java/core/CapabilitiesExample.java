package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

/**
 * Created by Yevhen on 31.05.2017.
 */
public class CapabilitiesExample extends BrowserFactory {

    @Test
    public void capabilityExample(){

        ChromeOptions options = new ChromeOptions();

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability("pageLoadStrategy", "none");
        driver = new ChromeDriver(capabilities);
    }
}
