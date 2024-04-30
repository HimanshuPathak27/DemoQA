package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class RadioButtonPage extends BaseClass{

	public RadioButtonPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
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
	
	public void clickRadioButton() {
		radioButton.isEnabled();
		radioButton.click();
	}
	
	public String verifyYesRadioButton() {
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView()", yesRadioButton);
		
		yesRadioButton.isEnabled();
		yesRadioButton.click();
		
		return yesSelectionOutput.getText();
	}
	
	public String verifyImpressiveRadioButton() {
		impressiveRadioButton.isEnabled();
		impressiveRadioButton.click();
		
		return impressiveSelectionOutput.getText();
	}
	
	public boolean validateNoRadioButton() {
		return noRadioButton.isEnabled();
	}
	
}
