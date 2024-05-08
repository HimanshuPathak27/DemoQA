package StepDefinitions;

import org.testng.Assert;

import PageObjects.TextBoxPage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class TextBoxFeature_StepDefinitions extends BaseClass{

	@Then("User clicks on Text Box button on left rail elements")
	public void user_clicks_on_text_box_button_on_left_rail_elements() {
		textBoxPage= new TextBoxPage(ldriver);

		textBoxPage.clickTextBoxButton();
		log.info("PASSED | Text Box button is clicked");
	}

	@Then("User verifies the header of textboxs page {string}")
	public void user_verifies_the_header_of_textboxs_page(String expPageHeader) {

		String actPageHeader = textBoxPage.verifyPageHeader();
		Assert.assertEquals(actPageHeader, expPageHeader, "FAILED | Textbox Page header is mismatched");
		
		log.info("PASSED | Textboxes Page Header is validated");
	}
	
	@Then("User validate the inner text of all the textboxes as {string} {string} {string} {string}")
	public void user_validate_the_inner_text_of_all_the_textboxes_as(String expFullNameInnerTxt, String expEmailInnerTxt, String expCurrentAddInnerTxt, String expPermanentAddInnerTxt) {

		String[] innerText = textBoxPage.verifyTextboxesInnerText();
		
		String actFullNameInnerTxt = innerText[0];
		String actEmailInnerTxt = innerText[1];
		String actCurrentAddInnerTxt = innerText[2];
		String actPermanentAddInnerTxt = innerText[3];
		
		Assert.assertEquals(actFullNameInnerTxt, expFullNameInnerTxt, "FAILED | Inner text of Full Name textbox is mismatched");
		Assert.assertEquals(actEmailInnerTxt, expEmailInnerTxt, "FAILED | Inner text of Email textbox is mismatched");
		Assert.assertEquals(actCurrentAddInnerTxt, expCurrentAddInnerTxt, "FAILED | Inner text of Current Address textbox is mismatched");
		Assert.assertEquals(actPermanentAddInnerTxt, expPermanentAddInnerTxt, "FAILED | Inner text of Permanent textbox is mismatched");
		
		log.info("PASSED | Inner text of all Textboxes is validated");
		
	}

	@Then("User enters all the values under the textboxes")
	public void user_enters_all_the_values_under_the_textboxes() {

		textBoxPage.enterFullName("Himanshu");
		textBoxPage.enterEmail("himanshu.qa@gmail.com");
		textBoxPage.enterCurrentAddress("17/235 A-16, Hamas");
		textBoxPage.enterPermanentAddress("A-1303, Israel");

		log.info("PASSED | All Text Boxes are filled");
	}

	@Then("User clicks on Submit button")
	public void user_clicks_on_submit_button() {
		textBoxPage.clickSubmitButton();
		log.info("PASSED | Submit Button is clicked");
	}

}
