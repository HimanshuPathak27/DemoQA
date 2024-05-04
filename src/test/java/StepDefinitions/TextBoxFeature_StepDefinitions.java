package StepDefinitions;

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
