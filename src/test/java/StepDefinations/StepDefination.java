package StepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;


public class StepDefination extends base{



@Given("^Initializing the browser with chrome$")
public void initializing_the_browser_with_chrome() throws Throwable {
	 driver =initializeDriver();
 
}

@Given("^Navigate to \"([^\"]*)\" site$")
public void navigate_to_site(String arg1) throws Throwable {
	driver.get(arg1);
}

@Given("^Click on Login link in home page to land on secure sign in page$")
public void click_on_Login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
	LandingPage l=new LandingPage(driver);
	l.getLogin().click();
}

@When("^Ueser enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
public void ueser_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
	LoginPage lp= new LoginPage(driver);
	lp.getEmail().sendKeys(arg1);
	lp.getPassword().sendKeys(arg2);
	lp.getLogin().click();
}

@Then("^Verify that user is successfully logged in$")
public void verify_that_user_is_successfully_logged_in() throws Throwable {
	PortalHomePage p=new PortalHomePage(driver);
	Assert.assertTrue(p.getSearchBox().isDisplayed());
}
}