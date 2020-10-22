package steps;

import cucumber.api.java.en.Given;

public class TC03_EditLead extends BaseClass {

	
	@Given("Click Find Leads Link")
	public void click_Edit_Leads_Link() {
		driver.findElementByLinkText("Find Leads").click();
	}

	@Given("Click Phone label")
	public void click_Phone_label() {
		driver.findElementByXPath("//span[text()='Phone']").click();
	}

	@Given("Enter Phone Number (.*)")
	public void enter_Phone_Number(String ph) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(ph);
	}

	@Given("Click Find Leads")
	public void click_Find_Leads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}

	@Given("Click First Resulting lead")
	public void click_First_Resulting_lead() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}

	@Given("Click Edit button")
	public void click_Edit_button() {
		driver.findElementByLinkText("Edit").click();
	}

	@Given("Update Company name (.*)")
	public void update_Company_name (String comp) {
		driver.findElementById("updateLeadForm_companyName").sendKeys(comp);
	}
	

}
