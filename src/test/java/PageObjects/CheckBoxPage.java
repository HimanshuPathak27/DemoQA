package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class CheckBoxPage extends BaseClass {

	public CheckBoxPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//span[text()='Check Box']/..")
	WebElement checkBoxButton;
	
	@FindBy(xpath="//input[@id='tree-node-home']/../..//button")
	WebElement homeCaret;
	
	@FindBy(xpath="//input[@id='tree-node-desktop']/../..//button")
	WebElement desktopCaret;
	
	@FindBy(xpath="//input[@id='tree-node-notes']/..//span")
	WebElement notesCheckBox;
	
	@FindBy(xpath="//input[@id='tree-node-documents']/../..//button")
	WebElement documentsCaret;
	
	@FindBy(xpath="//input[@id='tree-node-workspace']/../..//button")
	WebElement workspaceCaret;
	
	@FindBy(xpath="//input[@id='tree-node-react']/..//span")
	WebElement reactCheckBox;
	
	@FindBy(xpath="//input[@id='tree-node-downloads']/../..//button")
	WebElement downloadsCaret;
	
	@FindBy(xpath="//input[@id='tree-node-excelFile']/..//span")
	WebElement excelfilesCheckBox;
	
	@FindBy(xpath="//span[text()='notes']")
	WebElement actSelection1;
	
	@FindBy(xpath="//span[text()='react']")
	WebElement actSelection2;
	
	@FindBy(xpath="//span[text()='excelFile']")
	WebElement actSelection3;

	public void clickCheckBoxButton() {
		checkBoxButton.isEnabled();
		checkBoxButton.click();
	}
	
	public void selectNotesCheckBox() {
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView()", homeCaret);
		homeCaret.click();
		desktopCaret.click();
		notesCheckBox.click();
	}
	
	public void selectReactCheckBox() {
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView()", documentsCaret);
		documentsCaret.click();
		workspaceCaret.click();
		reactCheckBox.click();
	}
	
	public void selectExcelFilesCheckBox() {
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView()", downloadsCaret);
		downloadsCaret.click();
		excelfilesCheckBox.click();
	}
	
	public String[] validateSelection() {
		String[] actSelectedValues = new String[3];
		actSelectedValues[0] = actSelection1.getText();
		actSelectedValues[1] = actSelection2.getText();
		actSelectedValues[2] = actSelection3.getText();
		return actSelectedValues;	
	}
	
	
}
