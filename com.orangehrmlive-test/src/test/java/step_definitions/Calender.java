package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.ConfigurationReader;
import utilities.Drivers;

public class Calender {

	public static void main(String[] args) {

		Drivers.getInstance().get(ConfigurationReader.getProperty("url"));
		Drivers.getInstance().findElement(By.id("txtUsername")).sendKeys("admin");
		Drivers.getInstance().findElement(By.id("txtPassword")).sendKeys("admin123" + Keys.ENTER);
		Drivers.getInstance().findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		;
		Drivers.getInstance().findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		;
		Drivers.getInstance().findElement(By.xpath("//input[@id='firstName']")).sendKeys("Mia");
		Drivers.getInstance().findElement(By.xpath("//input[@id='lastName']")).sendKeys("Muu");
		Drivers.getInstance().findElement(By.xpath("//input[@id='btnSave']")).click();
		Drivers.getInstance().findElement(By.xpath("//input[@id='btnSave']")).click();
		WebElement dob = Drivers.getInstance().findElement(By.xpath("//input[@id='personal_DOB']"));

		String dateeval = "2019-07-08";

		selectdatebyJS(Drivers.getInstance(), dob, dateeval);

	}

	public static void selectdatebyJS(WebDriver driver, WebElement element, String dateeval) {
		JavascriptExecutor Js = ((JavascriptExecutor) driver);
		Js.executeScript("arguments[0].setAttribute('value',  '" + dateeval + "');", element);
	}
}
