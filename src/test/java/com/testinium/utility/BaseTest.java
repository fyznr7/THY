package com.testinium.utility;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class BaseTest
{
    public static AppiumDriver driver;
    public WebDriverWait webDriverWait;
    @BeforeScenario
    public void setUp() throws MalformedURLException,Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("appPackage","com.turkishairlines.mobile");
        capabilities.setCapability("appActivity",".ui.ACSplash");
        capabilities.setCapability("noReset",true);

        driver  = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
        webDriverWait = new WebDriverWait(driver,7);

    }
    @AfterScenario
    public void quit(){
        if(driver!=null)
        {
            driver.quit();
        }
    }


}
