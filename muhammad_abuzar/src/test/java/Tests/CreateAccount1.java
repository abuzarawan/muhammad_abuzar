package Tests;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CreateAccount1 {

    public AndroidDriver driver;
    public static AndroidDriver<AndroidElement> adriver;

    @BeforeTest
    public void setUP() throws IOException {
        String appiumServerURl = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability(MobileCapabilityType.APP, "/Users/muhammadabuzar/Desktop/muhammad/test.apk");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
        caps.setCapability("appPackage", "org.gnucash.android");
        caps.setCapability("appWaitActivity", "org.gnucash.android.ui.wizard.FirstRunWizardActivity");
        //caps.setCapability(MobileCapabilityType.LANGUAGE, APP_LANGUAGE);
        //caps.setCapability(MobileCapabilityType.LOCALE, APP_LOCALE);
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
        caps.setCapability(MobileCapabilityType.EVENT_TIMINGS, true);
        caps.setCapability("androidInstallTimeout", 300000);
        caps.setCapability("adbExecTimeout", 120000);
        caps.setCapability("appWaitDuration", 60000);
        caps.setCapability("uiautomator2ServerInstallTimeout", 120000);
        caps.setCapability("uiautomator2ServerLaunchTimeout", 120000);
        caps.setCapability("skipServerInstallation", false);

        driver = new AndroidDriver(new URL(appiumServerURl), caps);

    }


    @Test
    public void secondTest(){

        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.findElementById("btn_save").click();
        driver.findElementByXPath("//android.widget.CheckedTextView[1]").click();
        driver.findElementById("btn_save").click();
        driver.findElementByXPath("//android.widget.CheckedTextView[2]").click();
        driver.findElementById("btn_save").click();
        driver.findElementByXPath("//android.widget.CheckedTextView[1]").click();
        driver.findElementById("btn_save").click();
        driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.TextView[2][@text = 'CHF']").isDisplayed();
        driver.findElementByXPath("//android.widget.LinearLayout[2]/android.widget.TextView[2][@text = 'Import my accounts']").isDisplayed();
        driver.findElementById("btn_save").click();
    }
}
