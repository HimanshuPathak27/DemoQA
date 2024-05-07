package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.BaseClass;

public class ButtonsPage extends BaseClass{

	// Constructor to instantiate Webdriver instance
	public ButtonsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);

		js = (JavascriptExecutor) ldriver;
	}

	// Locating Elements
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

	// Click on Buttons button on left rail
	public void clickButtonsButton() {
		
		js.executeScript("arguments[0].scrollIntoView()", buttonsButton);
		
		try {
			if(buttonsButton.isDisplayed() && buttonsButton.isEnabled()) {
				try {
					buttonsButton.click();
				}
				catch (Exception e) {
					log.info("FAILED | Buttons button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Buttons button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	// Click on Double Click Me button
	public String verifyDoubleClickAction() {
		
		js.executeScript("arguments[0].scrollIntoView()", doubleClickMeButton);
		
		try {
			if(doubleClickMeButton.isDisplayed() && doubleClickMeButton.isEnabled()) {
				try {
					act = new Actions(ldriver);
					act.doubleClick(doubleClickMeButton).perform();
				}
				catch (Exception e) {
					log.info("FAILED | Double click action on Double Click Me button is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Double Click Me button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		String doubleClickMsg = "";
		try {
			wait.until(ExpectedConditions.visibilityOf(doubleClickMessage));
			doubleClickMsg = doubleClickMessage.getText();
		} catch (Exception e) {
			log.info("FAILED | Unable to fetch Output of double click action on Double Click Me button");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return doubleClickMsg;

	}

	// Click on Right Click Me button
	public String verifyRightClickAction() {
		
		js.executeScript("arguments[0].scrollIntoView()", rightClickMeButton);
		
		try {
			if(rightClickMeButton.isDisplayed() && rightClickMeButton.isEnabled()) {
				try {
					act = new Actions(ldriver);
					act.contextClick(rightClickMeButton).perform();
				}
				catch (Exception e) {
					log.info("FAILED | Right click action on Right Click Me button is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Double Click Me button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		String rightClickMsg = "";
		try {
			wait.until(ExpectedConditions.visibilityOf(rightClickMeMessage));
			rightClickMsg = rightClickMeMessage.getText();
		} catch (Exception e) {
			log.info("FAILED | Unable to fetch Output of right click action on Right Click Me button");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return rightClickMsg;

	}

	// Click on Click Me button
	public String verifyClickAction() {
		
		js.executeScript("arguments[0].scrollIntoView()", clickMeButton);
		
		try {
			if(clickMeButton.isDisplayed() && clickMeButton.isEnabled()) {
				try {
					clickMeButton.click();
				}
				catch (Exception e) {
					log.info("FAILED | Click action on Right Click Me button is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Click Me button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		String clickMsg = "";
		try {
			wait.until(ExpectedConditions.visibilityOf(clickMeMessage));
			clickMsg = clickMeMessage.getText();
		} catch (Exception e) {
			log.info("FAILED | Unable to fetch Output of click action on Click Me button");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return clickMsg;

	}
}
