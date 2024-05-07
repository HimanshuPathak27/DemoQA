package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class CheckBoxPage extends BaseClass {

	// Constructor to instantiate Webdriver instance
	public CheckBoxPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);

		js = (JavascriptExecutor) ldriver;
	}

	// Locating Elements
	@FindBy(xpath="//span[text()='Check Box']/..")
	WebElement checkboxButton;

	@FindBy(xpath="//input[@id='tree-node-home']/../..//button")
	WebElement homeCaret;

	@FindBy(xpath="//input[@id='tree-node-desktop']/../..//button")
	WebElement desktopCaret;

	@FindBy(xpath="//input[@id='tree-node-notes']/..//span")
	WebElement notesCheckbox;

	@FindBy(xpath="//input[@id='tree-node-documents']/../..//button")
	WebElement documentsCaret;

	@FindBy(xpath="//input[@id='tree-node-workspace']/../..//button")
	WebElement workspaceCaret;

	@FindBy(xpath="//input[@id='tree-node-react']/..//span")
	WebElement reactCheckbox;

	@FindBy(xpath="//input[@id='tree-node-downloads']/../..//button")
	WebElement downloadsCaret;

	@FindBy(xpath="//input[@id='tree-node-excelFile']/..//span")
	WebElement excelfilesCheckbox;

	@FindBy(xpath="//span[text()='notes']")
	WebElement notesSelectionOutput;

	@FindBy(xpath="//span[text()='react']")
	WebElement reactSelectionOutput;

	@FindBy(xpath="//span[text()='excelFile']")
	WebElement excelfileSelectionOutput;

	// Click on Checkbox button on left rail
	public void clickCheckBoxButton() {

		try {
			if(checkboxButton.isDisplayed() && checkboxButton.isEnabled()) {
				try {
					checkboxButton.click();
				} 
				catch (Exception e) {
					log.info("FAILED | Check Box button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Check Box button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	// Select Notes Checkbox
	public void selectNotesCheckBox() {

		try {
			js.executeScript("arguments[0].scrollIntoView()", homeCaret);

			if(homeCaret.isDisplayed() && homeCaret.isEnabled()) {
				try {
					homeCaret.click();						
				} 
				catch (Exception e) {
					log.info("FAILED | Home Caret icon click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}

			if(desktopCaret.isDisplayed() && desktopCaret.isEnabled()) {
				try {
					desktopCaret.click();						
				} 
				catch (Exception e) {
					log.info("FAILED | Desktop Caret icon click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}

			if(notesCheckbox.isDisplayed() && notesCheckbox.isEnabled()) {
				try {
					if(notesCheckbox.isSelected()) {
						notesCheckbox.click();
					}
					else {
						notesCheckbox.click();
					}
				}
				catch (Exception e) {
					log.info("FAILED | Notes Checkbox is pre-selected");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Notes Checkbox is not Interactable");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	// Select React Checkbox
	public void selectReactCheckBox() {

		try {
			js.executeScript("arguments[0].scrollIntoView()", documentsCaret);

			if(documentsCaret.isDisplayed() && documentsCaret.isEnabled()) {
				try {
					documentsCaret.click();						
				} 
				catch (Exception e) {
					log.info("FAILED | Documents Caret icon click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}

			if(workspaceCaret.isDisplayed() && workspaceCaret.isEnabled()) {
				try {
					workspaceCaret.click();						
				} 
				catch (Exception e) {
					log.info("FAILED | Workspace Caret icon click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}

			if(reactCheckbox.isDisplayed() && reactCheckbox.isEnabled()) {
				try {
					if(reactCheckbox.isSelected()) {
						reactCheckbox.click();
					}
					else {
						reactCheckbox.click();
					}
				}
				catch (Exception e) {
					log.info("FAILED | React Checkbox is pre-selected");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}

		catch (Exception e) {
			log.info("FAILED | React Checkbox is not Interactable");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	// Select Excel File Checkbox
	public void selectExcelFilesCheckBox() {


		try {
			js.executeScript("arguments[0].scrollIntoView()", downloadsCaret);

			if(downloadsCaret.isDisplayed() && downloadsCaret.isEnabled()) {
				try {
					downloadsCaret.click();						
				} 
				catch (Exception e) {
					log.info("FAILED | Downloads Caret icon click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}

			if(excelfilesCheckbox.isDisplayed() && excelfilesCheckbox.isEnabled()) {
				try {
					if(excelfilesCheckbox.isSelected()) {
						excelfilesCheckbox.click();
					}
					else {
						excelfilesCheckbox.click();
					}
				}
				catch (Exception e) {
					log.info("FAILED | Excel Files Checkbox is pre-selected");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}

		catch (Exception e) {
			log.info("FAILED | Excel Files Checkbox is not Interactable");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	// Validate the output of selection of checkboxes
	public String[] validateSelectionOutput() {
		String[] actSelectedValues = new String[3];
		actSelectedValues[0] = "";
		actSelectedValues[1] = "";
		actSelectedValues[2] = "";

		try {
			actSelectedValues[0] = notesSelectionOutput.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch Output of Notes checkbox Selection");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			actSelectedValues[1] = reactSelectionOutput.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch Output of React checkbox Selection");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			actSelectedValues[2] = excelfileSelectionOutput.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch Output of Excel Files checkbox Selection");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return actSelectedValues;	
	}


}
