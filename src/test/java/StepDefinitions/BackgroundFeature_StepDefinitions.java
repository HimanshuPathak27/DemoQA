package StepDefinitions;

import org.apache.logging.log4j.*;
import org.testng.Assert;

import PageObjects.TestBackground;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class BackgroundFeature_StepDefinitions extends BaseClass{

	public BackgroundFeature_StepDefinitions() {
		testBG = new TestBackground(ldriver);
		log = LogManager.getLogger("DemoQALogs");
	}

	@Given("User launched a Browser")
	public void user_launched_a_browser() {
		testBG.setup();
		log.info("PASSED | Chrome Driver is Launched");
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
		testBG.loadApplication(url);
		log.info("PASSED | URL is loaded");
	}

	@Then("User verify title of landing Page {string}")
	public void user_verify_title_of_landing_page(String expectedTitle) {
		String actualTitle = testBG.verifyHomePageTitle();
		Assert.assertEquals(actualTitle, expectedTitle , "FAILED | Titles Mismatched");
		log.info("PASSED | Home Page title is validated");
	}

	@When("User cliks on Elements tab")
	public void user_cliks_on_elements_tab() throws InterruptedException {
		testBG = new TestBackground(ldriver);

		testBG.clickElementsTile();
		log.info("PASSED | Elements tile is clicked");
	}

	@Then("User close the browser")
	public void user_close_the_browser() {
		ldriver.quit();
		log.info("PASSED | Chrome Browser is Closed");
	}

}
