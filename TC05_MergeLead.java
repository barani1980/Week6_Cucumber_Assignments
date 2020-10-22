package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC05_MergeLead extends BaseClass {


	public String leadID;
	public String window0;
	public String window1;
	public String window00;
	public String window01;
	public String text;
	
	@Given("Click Merge leads")
	public void click_Merge_leads() {
		driver.findElementByLinkText("Merge Leads").click();
	}

	@Given("Click on first Lookup")
	public void click_on_first_Lookup() {
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		window0 = allhandles.get(0);
		window1 = allhandles.get(1);
		driver.switchTo().window(window1);
	}

	@Given("Input Firstname for lookup1 as (.*) and search")
	public void input_Firstname_for_lookup1_and_search(String firstName) throws InterruptedException {
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(firstName);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
	}

	@Given("Store the first resulting leadID into a String")
	public void store_the_first_resulting_leadID_into_a_String() {
		leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
	}

	@Given("Click the first resulting leadID for lookup1")
	public void click_the_first_resulting_leadID_for_lookup1() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}
	
	
	@Given("Click on second Lookup")
	public void click_on_second_Lookup() {
		driver.switchTo().window(window0);
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<>(allWindows2);
		window00 = allhandles2.get(0);
		window01 = allhandles2.get(1);
		driver.switchTo().window(window01);
	}

	@Given("Input Firstname for lookup2 as (.*) and search")
	public void input_Firstname_for_lookup2_and_search(String mergeName) throws InterruptedException {
		
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(mergeName);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
	}

	@Given("Click the first resulting leadID for lookup2")
	public void click_the_first_resulting_leadID_for_lookup2() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}

	@Given("Click the Merge button and accept the alert")
	public void click_the_Merge_button_and_accept_the_alert() throws InterruptedException {
		driver.switchTo().window(window00);
		driver.findElementByXPath("//a[text()='Merge']").click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}

	@When("Search for the lookup1 lead id")
	public void search_for_the_lookup1_lead_id() {
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		text = driver.findElementByClassName("x-paging-info").getText();
	}

	@Then("lookup1 lead id doesnot exist anymore")
	public void lookup1_lead_id_doesnot_exist_anymore() {
		if (text.equalsIgnoreCase("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
}
