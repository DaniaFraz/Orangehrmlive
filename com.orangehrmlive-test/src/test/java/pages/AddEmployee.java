package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Drivers;

public class AddEmployee {

	public AddEmployee() {

		PageFactory.initElements(Drivers.getInstance(), this);

	}

	// click on addemployee
	@FindBy(linkText = "Add Employee")
	public WebElement addEmp;

	// Firstname
	@FindBy(id = "firstName")
	public WebElement firstName;

	// middlename
	@FindBy(id = "middleName")
	public WebElement middleName;

	// lastname
	@FindBy(id = "lastName")
	public WebElement lastName;

	// Verify EmployeeId
	@FindBy(id = "employeeId")
	public WebElement empId;

	// Check BOx/verify/click if un-clicked
	@FindBy(xpath = "//input[@id='chkLogin']")
	public WebElement checkBox;

	// UserCredential
	@FindBy(xpath = "//input[@name='user_name']")
	public WebElement userName;

	@FindBy(xpath = "//input[@name='user_password']")
	public WebElement passWord;

	@FindBy(xpath = "//*[@id='re_password' or @name='re_password']")
	public WebElement RepassWord;

	// status
	@FindBy(id = "status")
	public WebElement status;

	// enables
	@FindBy(xpath = "//option[contains(text(),'Enabled')]")
	public WebElement enable;

	// saveButton
	@FindBy(id = "btnSave")
	public WebElement save;

//	// handling Dynamic Web Table
//	@FindBy(id = "resultTable")
//	public WebElement webtable;

}
