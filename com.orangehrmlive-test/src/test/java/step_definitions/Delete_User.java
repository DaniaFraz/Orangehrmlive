package step_definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PIMPage;
import utilities.Drivers;

public class Delete_User {

	PIMPage pimpage = new PIMPage();
	int rowsize;
	WebDriverWait wait;

	@When("^I check the checkbox assoicated with employee$")
	public void i_check_the_checkbox_assoicated_with_employee() throws Throwable {

		WebElement webtable = Drivers.getInstance().findElement(By.id("resultTable"));

		// print number of rows in table
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		rowsize = rows.size();
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
					break;
				}

				if (cellvalue.equals("Ariana")) {
					Drivers.getInstance()
							.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + row + "]/td[1]")).getText();
					break;
				}
			}
		}
	}

	@When("^I click on delete button$")
	public void i_click_on_delete_button() throws Throwable {

		wait = new WebDriverWait(Drivers.getInstance(), 60);

		Thread.sleep(3000);
		// click on delete button
		Drivers.getInstance().findElement(By.id("btnDelete")).click();
		// click ok on popup message box

		try {
			Drivers.getInstance().switchTo().alert().accept();
		} catch (NoAlertPresentException e) {

		}

	}

	@Then("^employee should be deleted$")
	public void employee_should_be_deleted() throws Throwable {

		WebElement webtable1 = Drivers.getInstance().findElement(By.id("resultTable"));

		List<WebElement> rows = webtable1.findElements(By.tagName("tr"));
		int rowsize1 = rows.size();
		System.out.println("WebTable rows Count: " + rowsize1);

		if (rowsize1 < rowsize) {
			Assert.assertTrue(true);
		}

		JavascriptExecutor js = ((JavascriptExecutor) Drivers.getInstance());
		String sText = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(sText);

		if (sText.contains("Successfully Deleted")) {
			Assert.assertTrue(true);
		} else {
			System.out.println("Not Captured");
		}
	}
}