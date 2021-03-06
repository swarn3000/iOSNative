package Setup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Swarn on 8/20/2017.
 */
public class AppiumSetup {


    //public static AppiumDriver driver;
    public static WebDriver driver;
    //public static WebDriverWait waitVar;


    public void createDriver() throws MalformedURLException, InterruptedException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("appium-version","1.6");
        capabilities.setCapability("deviceName", "iPhone 7 Plus");
        capabilities.setCapability("platformVersion", "10.3");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("bundleId","com.bspot.casino101.test");
        //capabilities.setCapability("app","/Users/swarn/Library/Developer/Xcode/DerivedData/lounge7-ctydjkugkyirsncopsqdgicvqggl/Build/Products/Debug-iphonesimulator/lounge7.app");
        capabilities.setCapability("app","/Users/cerebralfix/Library/Developer/Xcode/DerivedData/lounge7-cdhfrquecxrrngcfhktxoayaftxq/Build/Products/Debug-iphonesimulator/lounge7.app");
        //capabilities.setCapability("app","/Users/swarn/Library/Developer/Xcode/DerivedData/lounge7-ctydjkugkyirsncopsqdgicvqggl/Build/Products/Debug-iphoneos/lounge7.app");
        //capabilities.setCapability("autoAcceptAlerts", true);
        //capabilities.setCapability("appPackage", "com.cucumberrntest");
        //capabilities.setCapability("appActivity", "com.cucumberrntest.MainActivity");
        //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


        //iPhone6
        //capabilities.setCapability("udid","a3eb076b6f1d46fa40c3661ed928592df544b945");

        //iPhone5s
        //capabilities.setCapability("udid","a8f3f946a84ebd9d573e6c359cfae7f358f55bcf");
        //capabilities.setCapability("automationName" ,  "XCUITest");
        /*final File classpathRoot= new File(System.getProperty("user.dir"));
        final File appDir = new File(classpathRoot,"src/test/");
        final File app = new File(appDir,"lounge7.app");
        capabilities.setCapability("app",app.getAbsolutePath());*/
        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //WebDriverRunner.setWebDriver(driver);

        System.out.println("called log");
    }

    public void teardown() {
        // close the app
        driver.quit();
    }
}
