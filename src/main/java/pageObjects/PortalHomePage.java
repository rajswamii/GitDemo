package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//rahulonlinetutor@gmail.com
public class PortalHomePage {

	public WebDriver driver;

	By searchBox = By.name("query");

	public PortalHomePage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getSearchBox() {
		return driver.findElement(searchBox);
	}

}