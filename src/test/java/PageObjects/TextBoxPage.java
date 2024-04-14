package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {

	WebDriver ldriver;

	public TextBoxPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//span[text()='Text Box']/..")
	WebElement textBoxButton;
	
	@FindBy(xpath = "//input[@id='userName']")
	WebElement fullNameField;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement eMailField;
	
	@FindBy(xpath = "//textarea[@id='currentAddress']")
	WebElement currentAddressField;
	
	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	WebElement permanentAddressField;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitButton;
	
	public void clickTextBoxButton() {
		textBoxButton.isEnabled();
		textBoxButton.click();
	}
	
	public void enterFullName(String fullName) {
		fullNameField.isEnabled();
		fullNameField.clear();
		fullNameField.sendKeys(fullName);
	}
	
	public void enterEmail(String email) {
		eMailField.isEnabled();
		eMailField.clear();
		eMailField.sendKeys(email);
	}
	
	public void enterCurrentAddress(String currentAddress) {
		currentAddressField.isEnabled();
		currentAddressField.clear();
		currentAddressField.sendKeys(currentAddress);
	}
	
	public void enterPermanentAddress(String permanentAddress) {
		permanentAddressField.isEnabled();
		permanentAddressField.clear();
		permanentAddressField.sendKeys(permanentAddress);
	}
	
	public void clickSubmitButton() {
		submitButton.isEnabled();
		submitButton.click();
	}
	
}
