package PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class TestBackground extends BaseClass {

	// Constructor to instantiate Webdriver instance
	public TestBackground(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);

		js = (JavascriptExecutor) ldriver;
	}

	// Locating Elements
	@FindBy(xpath = "//h5[text()='Elements']/..")
	WebElement elementsTile;


	// Launch browser and maximize it
	public void setup() {

		try {
			ldriver = new ChromeDriver();
			ldriver.manage().window().maximize();

		}
		catch (Exception e) {
			log.info("FAILED | Unable to Launch Chrome Browser");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	// Load URL
	public void loadApplication(String url) {
		try {
			ldriver.get(url);
		}
		catch (Exception e) {
			log.info("FAILED | Unable to Load Application URL");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
	}

	// Verify Home Page Title
	public String verifyHomePageTitle() {

		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String homePageTitle="";
		try {
			homePageTitle = ldriver.getTitle();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch title of Home Page");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		return homePageTitle;
	}

	// Click on Elements tile on Home Page
	public void clickElementsTile() {

		try {
			if(elementsTile.isDisplayed() && elementsTile.isEnabled()) {
				try {
					js.executeScript("arguments[0].scrollIntoView()", elementsTile);
					elementsTile.click();

				} 
				catch (Exception e) {
					log.info("FAILED | Elements Tile button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Elements Tile button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
	}

	// Close browser
	public void tearDown() {
		try {
			ldriver.quit();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to close the Chrome Browser");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
	}

}
