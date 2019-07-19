package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Drivers;

public class Dashboard {

	public Dashboard() {
		PageFactory.initElements(Drivers.getInstance(), this);
	}

	@FindBy(css = "#welcome")
	public WebElement welCome;

	@FindBy(linkText = "Logout")
	public WebElement logout;
}
