package StepDefinitions;

import org.apache.logging.log4j.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.HomePage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class BackgroundFeature_StepDefinitions extends BaseClass{
	
	@Given("User launched a Browser")
	public void user_launched_a_browser() {
		log = LogManager.getLogger("DemoQALogs");
		
		ldriver = new ChromeDriver();
	    ldriver.manage().window().maximize();
	    log.info("PASSED | Chrome Driver is Launched Successfully");
	    
	    homePage = new HomePage(ldriver);
	}
	
	@When("User opens url {string}")
	public void user_opens_url(String url) {
		ldriver.get(url);
		log.info("PASSED | URL is loaded Successfully");
	}

	@Then("User verify title of landing Page {string}")
	public void user_verify_title_of_landing_page(String expectedTitle) {
	    String actualTitle = homePage.verifyHomePageTitle();
	    Assert.assertEquals(actualTitle, expectedTitle , "FAILED | Titles Mismatched");
	    log.info("PASSED | Home Page title is validated Successfully");
	}

	@When("User cliks on Elements tab")
	public void user_cliks_on_elements_tab() throws InterruptedException {
	    homePage.clickElementsTile();
	    log.info("PASSED | Elements tile is selected Successfully");
	}
	
	@Then("User close the browser")
	public void user_close_the_browser() {
		ldriver.quit();
		log.info("PASSED | Chrome Browser is Closed Successfully");
	}
	
}
