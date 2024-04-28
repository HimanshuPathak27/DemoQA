package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.HomePage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class BackgroundFeature_StepDefinitions extends BaseClass{
	
	@Given("User launched a Browser")
	public void user_launched_a_browser() {
		
		ldriver = new ChromeDriver();
	    ldriver.manage().window().maximize();
		
	    homePage = new HomePage(ldriver);
	}
	
	@When("User opens url {string}")
	public void user_opens_url(String url) {
		ldriver.get(url);
	}

	@Then("User verify title of landing Page {string}")
	public void user_verify_title_of_landing_page(String expectedTitle) {
	    String actualTitle = homePage.verifyHomePageTitle();
	    Assert.assertEquals(actualTitle, expectedTitle , "Failed | Titles Mismatched");
	}

	@When("User cliks on Elements tab")
	public void user_cliks_on_elements_tab() throws InterruptedException {
	    homePage.clickElementsTile();
	}
	
}
