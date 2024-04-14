package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.HomePage;
import PageObjects.TextBoxPage;
import io.cucumber.java.en.*;

public class TextBoxFeature_StepDefinitions {

	public WebDriver driver;
	public TextBoxPage textBoxPage;
	public HomePage homePage;
	
	@Given("User Already launched a Browser")
	public void user_already_launched_a_browser() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    textBoxPage = new TextBoxPage(driver);
	    homePage = new HomePage(driver);
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	}

	@Then("User verify title of landing Page {string}")
	public void user_verify_title_of_landing_page(String expectedTitle) {
	    String actualTitle = homePage.verifyHomePageTitle();
	    Assert.assertEquals(actualTitle, expectedTitle , "Failed | Titles Mismatched");
	}

	@When("User cliks on Elements tab")
	public void user_cliks_on_elements_tab() {
	    homePage.clickElementsTile();
	}

	@Then("User clicks on Text Box button on left rail elements")
	public void user_clicks_on_text_box_button_on_left_rail_elements() {
		textBoxPage.clickTextBoxButton();
	}

	@Then("User enters all the values under the textboxes")
	public void user_enters_all_the_values_under_the_textboxes() {
		textBoxPage.enterFullName("Himanshu");
		textBoxPage.enterEmail("himanshu.qa@gmail.com");
		textBoxPage.enterCurrentAddress("17/235 A-16, Hamas");
		textBoxPage.enterPermanentAddress("A-1303, Israel");
	}

	@Then("User clicks on Submit button")
	public void user_clicks_on_submit_button() {
		textBoxPage.clickSubmitButton();
	}

	@Then("User close the browser")
	public void user_close_the_browser() {
	    driver.quit();
	}
	
}
