package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Drivers;

public class HomePage {

	public HomePage() {

		PageFactory.initElements(Drivers.getInstance(), this);
	}

	// logo
	@FindBy(xpath = "//div[@id='divLogin']")
	public WebElement logo;

	// username
	@FindBy(xpath = "//input[@id='txtUsername']")
	public WebElement username;

	// password
	@FindBy(xpath = "//input[@id='txtPassword']")
	public WebElement password;

	// login
	@FindBy(id = "btnLogin")
	public WebElement loginbutton;

}
