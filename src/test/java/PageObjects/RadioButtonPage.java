package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class RadioButtonPage extends BaseClass{

	// Constructor to instantiate Webdriver instance
	public RadioButtonPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
		js = (JavascriptExecutor) ldriver;
	}

	// Locating Elements
	@FindBy(xpath="//span[text()='Radio Button']/..")
	WebElement radioButton;

	@FindBy(xpath="//label[text()='Yes']")
	WebElement yesRadioButton;

	@FindBy(xpath="//span[text()='Yes']")
	WebElement yesSelectionOutput;

	@FindBy(xpath="//label[text()='Impressive']")
	WebElement impressiveRadioButton;

	@FindBy(xpath="//span[text()='Impressive']")
	WebElement impressiveSelectionOutput;

	@FindBy(xpath="//input[@id='noRadio']")
	WebElement noRadioButton;

	// Click on Radio button on left rail
	public void clickRadioButton() {
		try {
			if(radioButton.isDisplayed() && radioButton.isEnabled()) {
				try {
					radioButton.click();
				}
				catch (Exception e) {
					log.info("FAILED | Radio button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Radio button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
	}

	// Click Yes radio button and verify the response
	public String verifyYesRadioButton() {
		js.executeScript("arguments[0].scrollIntoView()", yesRadioButton);

		try {
			if(yesRadioButton.isDisplayed() && yesRadioButton.isEnabled()) {
				try {
					yesRadioButton.click();
				}
				catch (Exception e) {
					log.info("FAILED | Yes radio button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Yes radio button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		
		String yesSelectionOutputText = "";

		try {
			yesSelectionOutputText = yesSelectionOutput.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch Output of Selection of Yes radio button");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		
		return yesSelectionOutputText;
	}

	// Click Impressive radio button and verify the response
	public String verifyImpressiveRadioButton() {
		
		try {
			if(impressiveRadioButton.isDisplayed() && impressiveRadioButton.isEnabled()) {
				try {
					impressiveRadioButton.click();
				}
				catch (Exception e) {
					log.info("FAILED | Impressive radio button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Impressive radio button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		
		String impressiveSelectionOutputText = "";

		try {
			impressiveSelectionOutputText = impressiveSelectionOutput.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch Output of Selection of Impressive radio button");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		
		return impressiveSelectionOutputText;
		
	}

	// Click No radio button and verify the response
	public boolean validateNoRadioButton() {
		
		boolean noRadioButtoSstatus = false;
		
		try {
			if(noRadioButton.isDisplayed() && !noRadioButton.isEnabled()) {
				noRadioButtoSstatus = true;
			}
		} catch (Exception e) {
			log.info("FAILED | Impressive radio button is Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		
		return noRadioButtoSstatus;
	}

}
