package StepDefinitions;

import org.testng.Assert;

import PageObjects.ButtonsPage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class ButtonsFeature_StepDefinitions extends BaseClass{

	@Then("User clicks on Buttons button on left rail elements")
	public void user_clicks_on_buttons_button_on_left_rail_elements() {
	    buttonsPage = new ButtonsPage(ldriver);
	    
	    buttonsPage.clickButtonsButton();
	    log.info("PASSED | Buttons button is clicked Successfully");
	}

	@Then("User perform double click action on Double Click Me button and verify the Result {string}")
	public void user_perform_double_click_action_on_double_click_me_button_and_verify_the_result(String expDoubleClickMessage) {
		String actDoubleClickMessage = buttonsPage.verifyDoubleClickAction();
	    Assert.assertEquals(expDoubleClickMessage, actDoubleClickMessage, "FAILED | Output of double click action is mismatched");
	    
	    log.info("PASSED | Output of double click action is Matched");
	}

	@Then("User perform right click action on Right Click Me button and verify the Result {string}")
	public void user_perform_right_click_action_on_right_click_me_button_and_verify_the_result(String expRightClickMessage) {
		buttonsPage.verifyRightClickAction();
		String actRightClickMessage = buttonsPage.verifyRightClickAction();
	    Assert.assertEquals(expRightClickMessage, actRightClickMessage, "FAILED | Output of right click action is mismatched");
	    
	    log.info("PASSED | Output of right click action is Matched");
	}

	@Then("User perform click action on Click Me button and verify the Result {string}")
	public void user_perform_click_action_on_click_me_button_and_verify_the_result(String expClickMessage) {
		buttonsPage.verifyClickAction();
		String actClickMessage = buttonsPage.verifyClickAction();
	    Assert.assertEquals(expClickMessage, actClickMessage, "FAILED | Output of click action is mismatched");
	    
	    log.info("PASSED | Output of click action is Matched");
	}
	
	
}
