package Setup;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Swarn on 8/20/2017.
 */
public class SD {

    HomePage homePage = new HomePage();


    @Given("^I open application on device$")
    public void i_open_application_on_device() throws Throwable {

        System.out.println("device");
        homePage.clickokk();
        //homePage.fillin();


        //homePage.ok();

        //homePage.checktest();
        //assertTrue(homePage.isHomePage());
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

/*    @When("^I enter credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_credentials_and(String usr, String pwd) throws Throwable {

        System.out.println("cerd8");
        //homePage.typeTextField1(arg1);
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }*/

    @Then("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {


        //homePage.handlepopup();

        //homePage.checktest();



        System.out.println("last");


        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    //@When("^I enter credentials (.*)$")
    @When("^I enter credentials \"([^\"]*)\" as username$")
    public void iEnterCredentialsAsUsername(String arg0) throws Throwable {
//comment
        //homePage.sendChar(arg0);
        homePage.ok(arg0);
        //homePage.fillin(arg0);
        //homePage.typeEmailAddress(arg0);
        //System.out.println("cerd");
        //homePage.ok(arg0);
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter the credentials \"([^\"]*)\" as username$")
    public void iEnterTheCredentialsAsUsername(String arg0) throws Throwable {
        homePage.ok(arg0);
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
