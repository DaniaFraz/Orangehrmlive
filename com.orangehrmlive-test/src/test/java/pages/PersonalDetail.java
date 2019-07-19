package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Drivers;

public class PersonalDetail {

	public PersonalDetail() {

		PageFactory.initElements(Drivers.getInstance(), this);

	}

	// verify the employee
	@FindBy(xpath = "//div[@id='profile-pic'][h1]")
	public WebElement EmployeeDetail;

	// click on the edit button
	@FindBy(css = "#btnSave")
	public WebElement Edit;

	// employee first name
	@FindBy(xpath = "//input[@id='personal_txtEmpFirstName']")
	public WebElement firstName;

	// employee last name
	@FindBy(xpath = "//input[@name='personal[txtEmpLastName]']")
	public WebElement lastName;

	// other ID
	@FindBy(xpath = "//input[@id='personal_txtOtherID']")
	public WebElement otherid;

	// licenceExp
	@FindBy(id = "personal_txtLicExpDate")
	public WebElement LicenceExpDate;

	// Gender selection
	@FindBy(xpath = "//label[contains(text(),'Gender')]")
	public WebElement gender;

	// marital status
	@FindBy(id = "personal_cmbMarital")
	public WebElement martialStatus;

	// nationality
	@FindBy(id = "personal_cmbNation")
	public WebElement nationality;

	// DOB
	@FindBy(id = "personal_DOB")
	public WebElement DOB;

	// click on the edit button
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement save1;

}
