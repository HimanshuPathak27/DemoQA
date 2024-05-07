package StepDefinitions;

import org.testng.Assert;

import PageObjects.LinksPage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class LinksFeature_StepDefinitions extends BaseClass{

	@Then("User clicks on Links button on left rail elements")
	public void user_clicks_on_links_button_on_left_rail_elements() {
		linksPage = new LinksPage(ldriver);

		linksPage.clickLinksButton();
		log.info("PASSED | Links button is clicked Successfully");
	}

	@Then("User clicks on Created API call link and validate the Response Code {string} and Response Message {string}")
	public void user_clicks_on_created_api_call_link_and_validate_the_response_code_and_response_message(String expResponseCode, String expResponseMessage) {

		String[] actresponses = linksPage.validateCreatedLinkResponses();
		Assert.assertEquals(actresponses[0], expResponseCode, "FAILED | Response Code of Created link is mismatched");
		Assert.assertEquals(actresponses[1], expResponseMessage, "FAILED | Response Message of Created link is mismatched");

		log.info("PASSED | Responses validated for Created link");
	}

	@Then("User clicks on No Content API call link and validate the Response Code {string} and Response Message {string}")
	public void user_clicks_on_no_content_api_call_link_and_validate_the_response_code_and_response_message(String expResponseCode, String expResponseMessage) {

		String[] actresponses = linksPage.validateNoContentLinkResponses();

		Assert.assertEquals(actresponses[0], expResponseCode, "FAILED | Response Code of No Content link is mismatched");
		Assert.assertEquals(actresponses[1], expResponseMessage, "FAILED | Response Message of No Content link is mismatched");

		log.info("PASSED | Responses validated for No Content link");
	}

	@Then("User clicks on Moved API call link and validate the Response Code {string} and Response Message {string}")
	public void user_clicks_on_moved_api_call_link_and_validate_the_response_code_and_response_message(String expResponseCode, String expResponseMessage) {

		String[] actresponses = linksPage.validateMovedLinkResponses();

		Assert.assertEquals(actresponses[0], expResponseCode, "FAILED | Response Code of Moved link is mismatched");
		Assert.assertEquals(actresponses[1], expResponseMessage, "FAILED | Response Message of Moved link is mismatched");

		log.info("PASSED | Responses validated for Moved link");
	}

	@Then("User clicks on Bad Request API call link and validate the Response Code {string} and Response Message {string}")
	public void user_clicks_on_bad_request_api_call_link_and_validate_the_response_code_and_response_message(String expResponseCode, String expResponseMessage) {

		String[] actresponses = linksPage.validateBadRequestLinkResponses();

		Assert.assertEquals(actresponses[0], expResponseCode, "FAILED | Response Code of Bad Request link is mismatched");
		Assert.assertEquals(actresponses[1], expResponseMessage, "FAILED | Response Message of Bad Request link is mismatched");

		log.info("PASSED | Responses validated for Bad Request link");
	}

	@Then("User clicks on Unauthorized API call link and validate the Response Code {string} and Response Message {string}")
	public void user_clicks_on_unauthorized_api_call_link_and_validate_the_response_code_and_response_message(String expResponseCode, String expResponseMessage) {

		String[] actresponses = linksPage.validateUnauthorizedLinkResponses();

		Assert.assertEquals(actresponses[0], expResponseCode, "FAILED | Response Code of Unauthorized link is mismatched");
		Assert.assertEquals(actresponses[1], expResponseMessage, "FAILED | Response Message of Unauthorized link is mismatched");

		log.info("PASSED | Responses validated for Unauthorized link");
	}

	@Then("User clicks on Forbidden API call link and validate the Response Code {string} and Response Message {string}")
	public void user_clicks_on_forbidden_api_call_link_and_validate_the_response_code_and_response_message(String expResponseCode, String expResponseMessage) {

		String[] actresponses = linksPage.validateFrobiddenLinkResponses();

		Assert.assertEquals(actresponses[0], expResponseCode, "FAILED | Response Code of Forbidden link is mismatched");
		Assert.assertEquals(actresponses[1], expResponseMessage, "FAILED | Response Message of Forbidden link is mismatched");

		log.info("PASSED | Responses validated for Forbidden link");
	}

	@Then("User clicks on Not Found API call link and validate the Response Code {string} and Response Message {string}")
	public void user_clicks_on_not_found_api_call_link_and_validate_the_response_code_and_response_message(String expResponseCode, String expResponseMessage) {

		String[] actresponses = linksPage.validateNotFoundLinkResponses();

		Assert.assertEquals(actresponses[0], expResponseCode, "FAILED | Response Code of Not Found link is mismatched");
		Assert.assertEquals(actresponses[1], expResponseMessage, "FAILED | Response Message of Not Found link is mismatched");

		log.info("PASSED | Responses validated for Unauthorized link");
	}

}
