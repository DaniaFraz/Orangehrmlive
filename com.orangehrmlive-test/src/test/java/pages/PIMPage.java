package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Drivers;

public class PIMPage {

	public PIMPage() {

		PageFactory.initElements(Drivers.getInstance(), this);

	}

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pim;

	@FindBy(id = "btnDelete")
	public WebElement deletebutton;

	@FindBy(xpath = "//input[@id='dialogDeleteBtn']")
	public WebElement okdeletebutton;

}
