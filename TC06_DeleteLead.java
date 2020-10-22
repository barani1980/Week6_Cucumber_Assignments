package steps;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC06_DeleteLead extends BaseClass {

	public String leadID;
	public String text;
	public String passresult;
	public String failresult;
	
	@Given("Click the first resulting lead")
	public void click_the_first_resulting_lead() {
		leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}
	
	@Given ("Click Delete button")
	public void click_delete_button() {
		driver.findElementByLinkText("Delete").click();
	}
	
	@Given ("Input deleted leadID and search leads")
	public void input_deleted_leadID_and_search_leads() throws InterruptedException {
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		text = driver.findElementByClassName("x-paging-info").getText();
	}
	
	@When ("If Lead is Successfully Deleted")
	public void lead_deleted_successfully() {
		if (text.equalsIgnoreCase("No records to display")) {
			passresult = "record is deleted";
		} 
		else {
			failresult = "record still exists";
		}
	}
	
	@Then ("print record is deleted")
	public void print_record_deleted() {
		System.out.println(passresult);
	}
	
	@But ("print record still exists")
	public void print_record_still_exists () {
		System.out.println(failresult);
	}
}
