package step_definitions;

import java.io.IOException;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Drivers;

public class HomePageStepDefs {

	HomePage login;

	@Given("^the user is on orangehrm home page$")
	public void the_user_is_on_orangehrm_home_page() throws IOException {

		System.out.println("Step 1");

		// Path, chromeObject and URL
		Drivers.getInstance().get(ConfigurationReader.getProperty("url"));

	}

	@When("^the user clicks on the user input box$")
	public void the_user_clicks_on_the_user_input_box() {
		System.out.println("Step 2");

		login = new HomePage();
		login.username.click();

	}

	@Then("^the user field should be enabled$")
	public void the_user_field_should_be_enabled() {
		System.out.println("Step 3 ");

		login = new HomePage();
		Assert.assertTrue(login.username.isEnabled());

	}

}
