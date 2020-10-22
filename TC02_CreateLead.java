package steps;

import cucumber.api.java.en.Given;

public class TC02_CreateLead extends BaseClass  {


	@Given("Click Create Lead link")
	public void click_Create_Lead_link() throws InterruptedException {
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(3000);
	}

	@Given("Enter Company Name as (.*)")
	public void enter_Company_Name(String company) {
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
	}

	@Given("Enter First Name as (.*)")
	public void enter_First_Name(String firstname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
	}

	@Given("Enter Last Name as (.*)")
	public void enter_Last_Name(String lastname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
	}


}
