package Tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assests {

    public AndroidDriver driver;

    @BeforeTest
    public void setUP() throws MalformedURLException {
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
    public void assests(){

        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.findElementById("btn_save").click();
        driver.findElementByXPath("//android.widget.CheckedTextView[2]").click();
        driver.findElementById("btn_save").click();
        driver.findElementById("btn_save").click();
        driver.findElementByXPath("//android.widget.CheckedTextView[1]").click();
        driver.findElementById("btn_save").click();
        driver.findElementById("btn_save").click();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.findElementById("android:id/button1").isDisplayed();
        driver.findElementById("android:id/button1").click();

        List<AndroidElement> idList = driver.findElementsById("org.gnucash.android:id/primary_text");
        for (int i = 0; i < idList.size(); i++) {
            if (idList.get(i).findElement(By.id("org.gnucash.android:id/primary_text")).getText().equals("Assets")) {
                idList.get(i).click();
                break;
            }
        }
        driver.findElementById("org.gnucash.android:id/primary_text").click();
        driver.findElementById("org.gnucash.android:id/create_transaction").click();
        driver.findElementById("org.gnucash.android:id/input_transaction_name").sendKeys("Test");
        driver.findElementById("org.gnucash.android:id/input_transaction_amount").sendKeys("75");
        driver.findElementById("org.gnucash.android:id/menu_save").click();
        driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TextView").getText().equals("€75.00");
        driver.navigate().back();
        driver.navigate().back();
    }
}
