package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Dashboard;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Drivers;

public class LoginstepDefinition {

	private HomePage login;
	Dashboard dash;

	@Given("^I am on the orangehrm webpage$")
	public void i_am_on_the_orangehrm_webpage() throws Throwable {

		System.out.println("Step 1");

		// Path, chromeObject and URL
		Drivers.getInstance().get(ConfigurationReader.getProperty("url"));

		login = new HomePage();

		Assert.assertTrue(Drivers.getInstance().getTitle().equals(ConfigurationReader.getProperty("Home.title")));

		Assert.assertTrue(login.logo.isDisplayed());
	}

	@When("^I login as a admin/hr$")
	public void i_login_as_a_admin_hr() throws Throwable {
		System.out.println("Step 2");

		Drivers.getInstance().findElement(By.id("txtUsername")).click();
		System.out.println("login as admin");

		// type username
		// wait.until(ExpectedConditions.visibilityOf(login.username));
		login.username.sendKeys(ConfigurationReader.getProperty("admin.username"));

		// type password
		// wait.until(ExpectedConditions.visibilityOf(login.password));
		login.password.sendKeys(ConfigurationReader.getProperty("admin.password"));
		// click login
		login.loginbutton.click();

	}

	@Then("^I should be able to verify that I am logged in$")
	public void i_should_be_able_to_verify_that_I_am_logged_in() throws Throwable {
		System.out.println("Step 3 ");

		Dashboard dash = new Dashboard();
		Thread.sleep(3000);
		Assert.assertTrue(dash.welCome.isDisplayed());
		dash.welCome.click();

		Thread.sleep(3000);
		dash.logout.click();

	}

	@When("^I input username in the username textbox$")
	public void i_input_username_in_the_username_textbox() throws Throwable {
		// pagefactory Object
		login = new HomePage();

		// click usernameBOX
		Drivers.getInstance().findElement(By.id("txtUsername")).click();
		System.out.println("login as admin");

		// type username
		login.username.sendKeys(ConfigurationReader.getProperty("admin.username"));

	}

	@When("^I input password into password textbox$")
	public void i_input_password_into_password_textbox() throws Throwable {

		// type password
		// wait.until(ExpectedConditions.visibilityOf(login.password));
		login.password.sendKeys(ConfigurationReader.getProperty("admin.password"));

	}

	@When("^I click on Login Button$")
	public void i_click_on_Login_Button() throws Throwable {
		// pagefactory Object
		login = new HomePage();

		Thread.sleep(3000);
		// click login
		login.loginbutton.click();

	}

	@When("^I login with \"([^\"]*)\" and \"([^\"]*)\"in the username textbox$")
	public void i_login_with_and_in_the_username_textbox(String arg1, String arg2) throws Throwable {

		login.username.sendKeys("username");
		login.password.sendKeys("password");
		login.loginbutton.click();
	}

}
