package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Drivers;

public class AddUser {

	public AddUser() {

		PageFactory.initElements(Drivers.getInstance(), this);

	}

	@FindBy(xpath = "//b[contains(text(),'My Info')]")
	public WebElement myInfo;

}
