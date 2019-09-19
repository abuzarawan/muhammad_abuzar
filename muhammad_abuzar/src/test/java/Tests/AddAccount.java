package Tests;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AddAccount {

    public AndroidDriver driver;

    @BeforeTest
    public void setUP() throws MalformedURLException {
        String appiumServerURl = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "5200fcfcc0d46487");
        caps.setCapability(MobileCapabilityType.APP, "/Users/muhammadabuzar/Desktop/muhammad/test.apk");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
        caps.setCapability("appPackage", "org.gnucash.android");
        caps.setCapability("appWaitActivity", "org.gnucash.android.ui.wizard.FirstRunWizardActivity");
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
    public void addAccount(){
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.findElementById("btn_save").click();
        driver.findElementByXPath("//android.widget.CheckedTextView[2]").click();
        driver.findElementById("btn_save").click();
        driver.findElementByXPath("//android.widget.CheckedTextView[3]").click();
        driver.findElementById("btn_save").click();
        driver.findElementByXPath("//android.widget.CheckedTextView[2]").click();
        driver.findElementById("btn_save").click();
        driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.TextView[2][@text = 'EUR']").isDisplayed();
        driver.findElementByXPath("//android.widget.LinearLayout[2]/android.widget.TextView[2][@text = 'Let me handle it']").isDisplayed();
        driver.findElementById("btn_save").click();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.findElementById("android:id/button1").isDisplayed();
        driver.findElementById("android:id/button1").click();
        driver.findElementById("org.gnucash.android:id/empty_view").isDisplayed();
        driver.findElementById("org.gnucash.android:id/fab_create_account").click();
        driver.findElementById("org.gnucash.android:id/input_account_name").sendKeys("Muhammad");
        driver.findElementById("org.gnucash.android:id/input_account_description").sendKeys("100");
        driver.findElementById("org.gnucash.android:id/checkbox_placeholder_account").click();
        driver.findElementById("org.gnucash.android:id/menu_save").click();
        driver.findElementByXPath("//android.widget.TextView[@text = 'Muhammad']").isDisplayed();

    }

}
