package steps;

import cucumber.api.java.en.Given;

public class TC04_DuplicateLead extends BaseClass {

	@Given("Click Duplicate lead button")
	public void click_Duplicate_Lead_Button () {
		driver.findElementByLinkText("Duplicate Lead").click();
	}
	
	
}
