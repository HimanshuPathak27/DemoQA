package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class ButtonsPage extends BaseClass{

	public ButtonsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//span[text()='Buttons']/..")
	WebElement buttonsButton;
	
	@FindBy(xpath="//button[@id='doubleClickBtn']")
	WebElement doubleClickMeButton;
	
	@FindBy(xpath="//p[@id='doubleClickMessage']")
	WebElement doubleClickMessage;
	
	@FindBy(xpath="//button[@id='rightClickBtn']")
	WebElement rightClickMeButton;
	
	@FindBy(xpath="//p[@id='rightClickMessage']")
	WebElement rightClickMeMessage;
	
	@FindBy(xpath="//button[text()='Click Me']")
	WebElement clickMeButton;
	
	@FindBy(xpath="//p[@id='dynamicClickMessage']")
	WebElement clickMeMessage;
	
	public void clickButtonsButton() {
		buttonsButton.isEnabled();
		buttonsButton.click();
	}
	
	public String verifyDoubleClickAction() {
		act = new Actions(ldriver);
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView()", doubleClickMeButton);
		
		act.doubleClick(doubleClickMeButton).perform();
		return doubleClickMessage.getText();
	}
	
	public String verifyRightClickAction() {
		act = new Actions(ldriver);
		
		act.contextClick(rightClickMeButton).perform();
		return rightClickMeMessage.getText();
	}
	
	public String verifyClickAction() {
		act = new Actions(ldriver);
		
		clickMeButton.click();
		return clickMeMessage.getText();
	}
}
