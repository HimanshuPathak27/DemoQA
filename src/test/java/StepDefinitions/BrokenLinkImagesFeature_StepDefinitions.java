package StepDefinitions;

import org.testng.Assert;

import PageObjects.BrokeLinkImagesPage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class BrokenLinkImagesFeature_StepDefinitions extends BaseClass{

	@Then("User clicks on Broken Link Images button on left rail elements")
	public void user_clicks_on_broken_link_images_button_on_left_rail_elements() {

		brokenLinkImgPage = new BrokeLinkImagesPage(ldriver);

		brokenLinkImgPage.clickBrokenLinkImagesButton();
		log.info("PASSED | Broken Link Images button is clicked");
	}

	@Then("User verifies the header of Broken Link Images page {string}")
	public void user_verifies_the_header_of_broken_link_images_page(String expPageHeader) {

		String actPageHeader = brokenLinkImgPage.verifyPageHeader();
		Assert.assertEquals(actPageHeader, expPageHeader, "FAILED | Broken Link Images Page header is mismatched");

		log.info("PASSED | Broken Link Images Page Header is validated");
	}

	@Then("User verify the valid image")
	public void user_verify_the_valid_image() {

		int actStatusCode = brokenLinkImgPage.verifyValidImage();
		int expectedStatusCode = 200;

		Assert.assertEquals(actStatusCode, expectedStatusCode, "FAILED | Image is Broken");

		log.info("PASSED | Image is valid");
		
	}

	@Then("User verify the broken image")
	public void user_verify_the_broken_image() {
		
		int actStatusCode = brokenLinkImgPage.verifyBrokenImage();
		int expectedStatusCode = 200;
		
		Assert.assertNotEquals(actStatusCode, expectedStatusCode, "FAILED | Image is Valid");

		log.info("PASSED | Image is Broken");
	}

	@Then("User clicks on valid link and verify the response")
	public void user_clicks_on_valid_link_and_verify_the_response() {
		
		int actStatusCode = brokenLinkImgPage.verifyValidImage();
		int expectedStatusCode = 200;

		Assert.assertEquals(actStatusCode, expectedStatusCode, "FAILED | Link is Broken");

		log.info("PASSED | Link is valid");
	}

	@Then("User clicks on broken link and verify the response")
	public void user_clicks_on_broken_link_and_verify_the_response() {
		
		int actStatusCode = brokenLinkImgPage.verifyBrokenLink();
		int expectedStatusCode = 200;
		
		Assert.assertNotEquals(actStatusCode, expectedStatusCode, "FAILED | Link is Valid");

		log.info("PASSED | Link is Broken");
	}
}
