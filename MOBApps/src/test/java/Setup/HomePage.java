package Setup;

//import com.codeborne.selenide.SelenideElement;


import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Swarn on 8/20/2017.
 */
public class HomePage extends AppiumSetup{



    /*public void handlepopup(){

        Alert alertOK = driver.switchTo().alert();
        alertOK.dismiss();
    }*/
    /*public void checktest(){
        driver.findElement(test).click();
    }*/

    //By test = MobileBy.xpath("/AppiumAUT/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage");
    //By test = MobileBy.xpath("/AppiumAUT/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[2]");
    By ClickOK = MobileBy.AccessibilityId("PermissionCheckForLocationAndAge");
    // By test = MobileBy.AccessibilityId("Allow");
    By ClickCreateAccountButton = MobileBy.AccessibilityId("GoToCreateAccountButtonID");
    By CLickLoginButton = MobileBy.AccessibilityId("GoToLoginID");
    By EmailTextField = MobileBy.AccessibilityId("Email");
    //By test1 = MobileBy.AccessibilityId("Like what you see? Create Account Login Try out in demo mode");
    //By test1 = MobileBy.IosUIAutomation("OK");
    //By test1 = MobileBy.AccessibilityId("OK");
    //By check = MobileBy.AccessibilityId("Email");

    public void clickokk() {

        //driver.findElement(test).click();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(ClickOK).click();
        driver.findElement(ClickCreateAccountButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(CLickLoginButton).click();


    }
 /*   public void sendChar(By  , String text) {
        EmailTextField.clear();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String s = new StringBuilder().append(c).toString();
            EmailTextField.sendKeys(s);
        }
    }*/

    public void ok(String text) {

        driver.findElement(EmailTextField).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(EmailTextField).clear();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        driver.findElement(EmailTextField).sendKeys(text);
        //waitVar.until(ExpectedConditions.visibilityOf(EmailTextField));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.linkText(text));
    }

//   public void fillin(){
//
//       //driver.findElement(By.name("Allow"));
//       //driver.findElement(By.name("OK"));
//        //driver.findElement(By.id("Create Account")).click();
//       //driver.findElement(test).sendKeys(text);
//   }


}

  /*  By textField1 = MobileBy.AccessibilityId("Email");
    By textField2 = MobileBy.AccessibilityId("Password");
    By Loginbutton = MobileBy.AccessibilityId("Login");*/
//By result = MobileBy.AccessibilityId("Answer");


// All the behavior of home page will be defined here in functions
/*    public boolean isHomePage(){
        waitVar.until(ExpectedConditions.presenceOfElementLocated(Loginbutton));
        return driver.findElement(Loginbutton).isDisplayed();
    }

    public void typeTextField1(String text){
        waitVar.until(ExpectedConditions.presenceOfElementLocated(textField1));
        driver.findElement(textField1).sendKeys(text);
    }

    public void typeTextField2(String text){
        waitVar.until(ExpectedConditions.presenceOfElementLocated(textField2));
        driver.findElement(textField2).sendKeys(text);
    }

    public void clickComputeSum(){
        waitVar.until(ExpectedConditions.presenceOfElementLocated(Loginbutton));
        driver.findElement(Loginbutton).click();
    }

    public String returnResult(){
        waitVar.until(ExpectedConditions.presenceOfElementLocated(result));
        return driver.findElement(result).getText();
    }*/

