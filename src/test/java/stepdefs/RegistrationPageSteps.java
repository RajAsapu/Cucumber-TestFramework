package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import setup.PageFactory;

/**
 * Created by asapu on 7/6/2017.
 */
public class RegistrationPageSteps {


    private PageFactory pageFactory = null;
    public RegistrationPageSteps()
    {
        pageFactory=new PageFactory();
    }

    @Given("^the user navigates to the registration page$")
    public void the_user_navigates_to_the_registration_page()  {
        pageFactory.getRegistrationMethods().navigateToRegistrationPage();
    }

    @When("^the user enters details$")
    public void the_user_enters_details(DataTable table)  {
        pageFactory.getRegistrationMethods().registerUser(table);
    }

    @When("^clicks on signup$")
    public void clicks_on_signup() {
        pageFactory.getRegistrationMethods().signup();
    }

    @Then("^the user should be registered$")
    public void the_user_should_be_registered()  {
        pageFactory.getRegistrationMethods().verifyIfUserIsRegistered();
    }

}
