package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseClass {

	@Given("enter the username as (.*)")
	public void enter_the_username_as(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@Given("enter the password as (.*)")
	public void enter_the_password_as(String pWord) {
		driver.findElementById("password").sendKeys(pWord);
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("homepage should be displayed")
	public void homepage_should_be_displayed() {
	    System.out.println(driver.getTitle());
	}
	
	@Given("click on CRMSFA Link")
	public void click_on_crmsfa_link() throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
	}
	
	@Given("Click Leads Tab")
	public void click_Leads_Tab() throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(3000);
	}	
	
	@Given("Click Submit button")
	public void click_Submit_button() throws InterruptedException {
		driver.findElementByName("submitButton").click();
		Thread.sleep(3000);
	}
	
}
