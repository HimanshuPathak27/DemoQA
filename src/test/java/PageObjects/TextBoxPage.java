package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class TextBoxPage extends BaseClass{

	// Constructor to instantiate Webdriver instance
	public TextBoxPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);

		js = (JavascriptExecutor) ldriver;
	}

	//Locating Elements
	@FindBy(xpath = "//span[text()='Text Box']/..")
	WebElement textBoxButton;
	
	@FindBy(xpath="//h1")
	WebElement pageHeader;

	@FindBy(xpath = "//input[@id='userName']")
	WebElement fullNameTextbox;

	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement emailTextbox;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	WebElement currentAddressTextBox;

	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	WebElement permanentAddressTextBox;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitButton;

	// Click on Text Box button on left rail
	public void clickTextBoxButton() {

		try {
			if(textBoxButton.isDisplayed() && textBoxButton.isEnabled()) {
				try {
					textBoxButton.click();
				} 
				catch (Exception e) {
					log.info("FAILED | Text Box button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Text Box button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}
	
	//Validate header of TextBox page
	public String verifyPageHeader() {

		String actPageHeader = "";
		
		try {
			if(pageHeader.isDisplayed()) {
				actPageHeader = pageHeader.getText();
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Page Header is not Displayed");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		
		return actPageHeader;

	}

	//Validate inner text on textboxes of TextBox page
	public String[] verifyTextboxesInnerText() {

		String[] innerText = new String[4];
		
		innerText[0] = "";
		innerText[1] = "";
		innerText[2] = "";
		innerText[3] = "";
		
		try {
			if(fullNameTextbox.isDisplayed() && fullNameTextbox.isEnabled()) {
				innerText[0] = fullNameTextbox.getAttribute("placeholder");
			}
			if(emailTextbox.isDisplayed() && emailTextbox.isEnabled()) {
				innerText[1] = emailTextbox.getAttribute("placeholder");
			}
			if(currentAddressTextBox.isDisplayed() && currentAddressTextBox.isEnabled()) {
				innerText[2] = currentAddressTextBox.getAttribute("placeholder");
			}
			if(permanentAddressTextBox.isDisplayed() && permanentAddressTextBox.isEnabled()) {
				innerText[3] = permanentAddressTextBox.getAttribute("placeholder");
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Unable to fetch Inner text");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		
		return innerText;

	}
	
	// Enter Full Name in textbox
	public void enterFullName(String fullName) {

		try {
			if(fullNameTextbox.isDisplayed() && fullNameTextbox.isEnabled()) {
				fullNameTextbox.clear();
				fullNameTextbox.sendKeys(fullName);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Full Name text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	// Enter Email in textbox
	public void enterEmail(String email) {

		try {
			if(emailTextbox.isDisplayed() && emailTextbox.isEnabled()) {
				emailTextbox.clear();
				emailTextbox.sendKeys(email);
			}
		}
		catch (Exception e) {
			log.info("FAILED | Email text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	// Enter Current Address in textbox
	public void enterCurrentAddress(String currentAddress) {

		try {
			if(currentAddressTextBox.isDisplayed() && currentAddressTextBox.isEnabled()) {
				currentAddressTextBox.clear();
				currentAddressTextBox.sendKeys(currentAddress);
			}
		}
		catch (Exception e) {
			log.info("FAILED | Current Address text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	// Enter Permanent Address in textbox
	public void enterPermanentAddress(String permanentAddress) {

		try {
			if(permanentAddressTextBox.isDisplayed() && permanentAddressTextBox.isEnabled()) {
				permanentAddressTextBox.clear();
				permanentAddressTextBox.sendKeys(permanentAddress);
			}
		}
		catch (Exception e) {
			log.info("FAILED | Permanent Address text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	// Click on submit button
	public void clickSubmitButton() {

		try {
			js.executeScript("arguments[0].scrollIntoView()", submitButton);

			if(submitButton.isDisplayed() && submitButton.isEnabled()) {
				try {
					submitButton.click();
				}
				catch (Exception e) {
					log.info("FAILED | Submit button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}

			}
		}
		catch (Exception e) {
			log.info("FAILED | Submit button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
	}

}
