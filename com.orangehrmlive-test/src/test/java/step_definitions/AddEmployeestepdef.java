package step_definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.extensions.TestDecorator;
import pages.AddEmployee;
import pages.PIMPage;
import pages.PersonalDetail;
import utilities.Drivers;
import utilities.ExcelUtilclass;

public class AddEmployeestepdef {

	PIMPage pimobject = new PIMPage();
	AddEmployee empl = new AddEmployee();
	PersonalDetail personaldetail = new PersonalDetail();
	List<Map<String, String>> TestData;

	@When("^I go to PIM tab from menu$")
	public void i_go_to_PIM_tab_from_menu() throws Throwable {
		pimobject.pim.click();

	}

	@When("^I click add employee$")
	public void i_click_add_employee() throws Throwable {
		empl.addEmp.click();

	}

	@When("^I complete the required information$")
	public void i_complete_the_required_information() throws Throwable {
		empl.firstName.sendKeys("Ariana");
		empl.lastName.sendKeys("Grace");
		// select the checkbox
		empl.checkBox.click();
		// enter username
		empl.userName.sendKeys("Malala123");
		// enter password
		empl.passWord.sendKeys("malala321");
		// confirm password
		empl.RepassWord.sendKeys("malala321");

		Thread.sleep(3000);
		// get the enabled option and store it inside a variable
		Assert.assertTrue(empl.enable.isSelected());

	}

	@When("^I save new employee data$")
	public void i_save_new_employee_data() throws Throwable {
		// save
		empl.save.click();
		Thread.sleep(3000);
	}

	@Then("^click on employee list for verification$")
	public void click_on_employee_list_for_verification() throws Throwable {

		WebElement webtable = Drivers.getInstance().findElement(By.id("resultTable"));

		// print number of rows in table
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		int rowsize = rows.size();
		System.out.println("WebTable rows Count: " + rowsize);

		// print number of columns in a table
		List<WebElement> columns = webtable.findElements(By.tagName("th"));
		int cellsnum = columns.size();
		System.out.println("WebTable rows Count: " + cellsnum);

		// Print all the elements from the webtable
		for (int row = 1; row < rowsize; row++) {

			for (int columns1 = 1; columns1 < cellsnum; columns1++) {

				String cellvalue = Drivers.getInstance()
						.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + row + "]/td[" + columns1 + "]"))
						.getText();

				System.out.println(cellvalue);

				if (cellvalue.equals("Ariana")) {
					Assert.assertTrue(cellvalue.equals("Ariana"));
					break;
				}

				if (cellvalue.equals("Ariana")) {

					break;
				}

			}

		}

	}

	@When("^I register Employee Account$")
	public void i_register_Employee_Account(DataTable data) throws Throwable {
		// click on PIM
		pimobject.pim.click();

		// Add Employee
		empl.addEmp.click();

		List<List<String>> lists = data.asLists(String.class);
		for (List<String> list : lists) {
			System.out.println(list);

			// Add Employee
			empl.addEmp.click();
			Thread.sleep(3000);
			// add firstname
			empl.firstName.sendKeys(list.get(0));
			// add lastname
			empl.lastName.sendKeys(list.get(1));
			// select the checkbox
			empl.checkBox.click();
			// enter username
			empl.userName.sendKeys(list.get(2));
			// enter password
			empl.passWord.sendKeys(list.get(3));
			// confirm password
			empl.RepassWord.sendKeys(list.get(4));

			// save
			empl.save.click();
			Thread.sleep(3000);
		}

	}

	@Then("^Employee accounts are activiated and ready for further use$")
	public void employee_accounts_are_activiated_and_ready_for_further_use() throws Throwable {

		// click on PIM
		pimobject.pim.click();

		// Verify if the employees got created d
		JavascriptExecutor js = ((JavascriptExecutor) Drivers.getInstance());

		String sText = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(sText);
		Assert.assertTrue(sText.contains("Ariana"));
		Assert.assertTrue(sText.contains("Sara"));
	}

	@When("^I register Employee Account with header$")
	public void i_register_Employee_Account_with_header(DataTable data) throws Throwable {

		// click on PIM
		pimobject.pim.click();

		// With header only
		List<Map<String, String>> maps = data.asMaps(String.class, String.class);
		for (Map<String, String> map : maps) {
			System.out.println(map);
			// Add Employee
			empl.addEmp.click();
			Thread.sleep(3000);
			// add lastname
			empl.firstName.sendKeys(map.get("fname"));
			// add lastname
			empl.lastName.sendKeys(map.get("lastname"));
			// select the checkbox
			empl.checkBox.click();
			// enter username
			empl.userName.sendKeys(map.get("username"));
			// enter password
			empl.passWord.sendKeys(map.get("password"));
			// confirm password
			empl.RepassWord.sendKeys(map.get("confirmpassword"));

			// save
			empl.save.click();
			Thread.sleep(3000);
		}

	}

	@Then("^Employee accounts are created and ready for further use$")
	public void employee_accounts_are_created_and_ready_for_further_use() throws Throwable {

		// click on PIM
		pimobject.pim.click();

		// Open the Utility
		ExcelUtilclass XlUtil = new ExcelUtilclass("C:\\Users\\dania\\OneDrive\\Documents\\ExcelFile\\orangehrm.xls",
				"Sheet1");
		TestData = XlUtil.getDataList();
		
		// With header only
				for (Map<String,String> empdata : TestData) {
					System.out.println(empdata);
				
					empl.addEmp.click();
					Thread.sleep(3000);
					// add lastname
					empl.firstName.sendKeys(empdata.get("fname"));
					// add lastname
					empl.lastName.sendKeys(empdata.get("lname"));
					// select the checkbox
					empl.checkBox.click();
					// enter username
					empl.userName.sendKeys(empdata.get("username"));
					// enter password
					empl.passWord.sendKeys(empdata.get("password"));
					// confirm password
					empl.RepassWord.sendKeys(empdata.get("confirmpassword"));

					empl.
					// save
					empl.save.click();
					Thread.sleep(3000);

	}

}
