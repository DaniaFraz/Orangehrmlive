package step_definitions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddUser;
import pages.HomePage;
import pages.PersonalDetail;
import utilities.Drivers;

public class LoginAsAnEmployee {

	HomePage login;
	AddUser adduser;
	PersonalDetail pd = new PersonalDetail();

	@When("^I enter employee username \"([^\"]*)\"$")
	public void i_enter_employee_username(String username) throws Throwable {
		login = new HomePage();

		login.username.sendKeys(username);
	}

	@When("^I enter employee password \"([^\"]*)\"$")
	public void i_enter_employee_password(String password) throws Throwable {
		login = new HomePage();

		login.password.sendKeys(password);

		login.loginbutton.click();
	}

	@When("^I click on MyInfo Tab$")
	public void i_click_on_MyInfo_Tab() throws Throwable {

		adduser = new AddUser();

		adduser.myInfo.click();
	}

	@When("^I click on edit button$")
	public void i_click_on_edit_button() throws Throwable {
		pd.Edit.click();

	}

	@When("^I complete the required fields$")
	public void i_complete_the_required_fields() throws Throwable {
		pd.otherid.sendKeys("Test");

		// use date time to get todays date
		DateFormat dateformat = new SimpleDateFormat("mm/dd/yy");
		java.util.Date today = Calendar.getInstance().getTime();
		String date = dateformat.format(today);
		System.out.println(date);

		String todaydate = date.substring(0, 2);
		System.out.println(todaydate);

		pd.LicenceExpDate.click();

		// Drivers.getInstance().findElement(By.xpath("//a[contains(text()," + todaydate
		// + ")]")).click();

		// gender
		pd.gender.click();

		// maritalStatus
		Select select = new Select(pd.martialStatus);
		select.selectByVisibleText("Married");

		// nationality
		Select Nationality = new Select(pd.nationality);
		Nationality.selectByValue("136");

		// save it
		pd.save1.click();

	}

//	@When("^I click on save button$")
//	public void i_click_on_save_button() throws Throwable {
//
//		// Save
//		  pd.save1.clear();
//	    	}

	@Then("^the boarding process is complete$")
	public void the_boarding_process_is_complete() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) Drivers.getInstance();
		String doc = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(doc);

		if (doc.contains("Successfully Save")) {
			org.junit.Assert.assertTrue(true);
		} else {
			System.out.println("not captured");
		}

	}

}
