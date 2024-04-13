package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.TexBoxPage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class TextBoxFeature_StepDefinitions extends BaseClass {

	TexBoxPage textBook = new TexBoxPage(driver);
	
	@Given("User Already launched a Browser")
	public void user_already_launched_a_browser() {
		driver = new ChromeDriver();
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@Then("User verify title of landing Page {string}")
	public void user_verify_title_of_landing_page(String expectedTitle) {
		Assert.assertEquals(expectedTitle, textBook.validateLandingPageTitle(), "Failed | Title of Landing Page is mismatched");
	}

	@When("User cliks on Elements tab")
	public void user_cliks_on_elements_tab() {
		try {
		textBook.clickElementsTile();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("User clicks on Text Box button on left rail elements")
	public void user_clicks_on_text_box_button_on_left_rail_elements() {
		
	}

	@Then("User enters all the values under the textboxes")
	public void user_enters_all_the_values_under_the_textboxes() {

	}

	@Then("User clicks on Submit Button")
	public void user_clicks_on_submit_button() {

	}

	@Then("User verifies the output of the submitted form with the response")
	public void user_verifies_the_output_of_the_submitted_form_with_the_response() {

	}
	
}
