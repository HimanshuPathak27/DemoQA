package StepDefinitions;

import org.testng.Assert;

import PageObjects.RadioButtonPage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class RadioButtonFeature_StepDefinitions extends BaseClass{

	@Then("User clicks on Radio button on left rail elements")
	public void user_clicks_on_radio_button_on_left_rail_elements() {
		radioButtonPage = new RadioButtonPage(ldriver);
		
		radioButtonPage.clickRadioButton();
		log.info("PASSED | Radio Button button Clicked");
	}

	@Then("Select Yes radio button and verify the Selected value {string}")
	public void select_yes_radio_button_and_verify_the_selected_value(String expSelectedValue) {
		String actualSelectedValue = radioButtonPage.verifyYesRadioButton();
		
		Assert.assertEquals(expSelectedValue, actualSelectedValue, "FAILED | Selected Values mismatched");
		log.info("PASSED | YES Radio Button button is validated");
	}

	@Then("Select Impressive radio button and verify the Selected value {string}")
	public void select_impressive_radio_button_and_verify_the_selected_value(String expSelectedValue) {
		String actualSelectedValue = radioButtonPage.verifyImpressiveRadioButton();
		
		Assert.assertEquals(expSelectedValue, actualSelectedValue, "FAILED | Selected Values mismatched");
		log.info("PASSED | IMPRESSIVE Radio Button button is validated");
	}

	@Then("User verifies the No radio button to be disabled")
	public void user_verifies_the_no_radio_button_to_be_disabled() {
		boolean expectedStatus = false;
		boolean actualStatus = radioButtonPage.validateNoRadioButton();
		
		Assert.assertEquals(expectedStatus, actualStatus, "FAILED | NO Radio button is enabled");
		log.info("PASSED | NO Radio Button button is validated");
	}
	
}
