package Setup;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.page;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Swarn on 8/20/2017.
 */
public class SD {

    HomePage homePage = new HomePage();

    @Given("^I open application on device$")
    public void i_open_application_on_device() throws Throwable {

        System.out.println("device");
        //assertTrue(homePage.isHomePage());
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_credentials_and(String usr, String pwd) throws Throwable {

        System.out.println("cerd8");
        //homePage.typeTextField1(arg1);
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        //homePage.checktest();
        System.out.println("last");


        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter credentials \"([^\"]*)\"$")
    public void iEnterCredentials(String arg0) throws Throwable {
//comment
        //homePage.typeEmailAddress(arg0);
        System.out.println("cerd");
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
