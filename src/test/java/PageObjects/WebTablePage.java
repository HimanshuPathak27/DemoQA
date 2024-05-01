package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class WebTablePage extends BaseClass {

	public WebTablePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath="//div[@class='rt-tr']/div")
	List<WebElement> tableHeaders;

	@FindBy(xpath="//div[@class='rt-tbody']/div")
	List<WebElement> tableRows;

	@FindBy(xpath="//div[@class='rt-tbody']/div[1]/div/div")
	List<WebElement> tableColumns;



	@FindBy(xpath="//span[text()='Web Tables']/..")
	WebElement webTableButton;

	@FindBy(xpath="//span[@id='edit-record-2']")
	WebElement editRecord2Button;

	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstNameField;

	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastNameField;

	@FindBy(xpath="//input[@id='age']")
	WebElement agetField;

	@FindBy(xpath="//input[@id='userEmail']")
	WebElement emailField;

	@FindBy(xpath="//input[@id='salary']")
	WebElement salaryField;

	@FindBy(xpath="//input[@id='department']")
	WebElement departmentField;

	@FindBy(xpath="//button[@id='submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//span[@id='delete-record-2']")
	WebElement deleteRecord2Button;
	
	@FindBy(xpath="//button[@id='addNewRecordButton']")
	WebElement addNewButton;
	
	@FindBy(xpath="//input[@id='searchBox']")
	WebElement searchBox;
	
	@FindBy(xpath="//span[@id='basic-addon2']")
	WebElement searchButton;
	

	public void clickWebTableButton() {
		webTableButton.isEnabled();
		webTableButton.click();
	}

	public ArrayList<String> verifyColumnHeaders() {

		ArrayList<String> columnHeaders = new ArrayList<String>();

		for(int h=1; h<=tableHeaders.size(); h++) {
			String tableHeaderXpath = "//div[@class='rt-tr']/div[" + h + "]";
			WebElement tableHeaderData = ldriver.findElement(By.xpath(tableHeaderXpath));

			columnHeaders.add(tableHeaderData.getText());
		}

		return columnHeaders;
	}

	public void UpdateRecord2(String firstName, String lastName, String email, String age, String salary, String dept) {

		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView()", editRecord2Button);

		editRecord2Button.isEnabled();
		editRecord2Button.click();

		firstNameField.clear();
		firstNameField.sendKeys(firstName);

		lastNameField.clear();
		lastNameField.sendKeys(lastName);

		emailField.clear();
		emailField.sendKeys(email);

		agetField.clear();
		agetField.sendKeys(age);

		salaryField.clear();
		salaryField.sendKeys(salary);

		departmentField.clear();
		departmentField.sendKeys(dept);

		submitButton.isEnabled();
		submitButton.click();
	}

	public ArrayList<String> verifyUpdatedRow2Record() {

		ArrayList<String> row2Data = new ArrayList<String>();

		for(int c=1; c<=tableColumns.size(); c++) {
			String row2ColumnsXpath = "//div[@class='rt-tbody']/div[2]/div/div[" + c + "]";
			WebElement row2Elements = ldriver.findElement(By.xpath(row2ColumnsXpath));

			row2Data.add(row2Elements.getText());
		}

		return row2Data;
	}
	
	public void deleteRecord2() {
		deleteRecord2Button.isEnabled();
		deleteRecord2Button.click();
	}
	
	public void addNewRecord(String firstName, String lastName, String email, String age, String salary, String dept) {
		addNewButton.isEnabled();
		addNewButton.click();

		firstNameField.clear();
		firstNameField.sendKeys(firstName);

		lastNameField.clear();
		lastNameField.sendKeys(lastName);

		emailField.clear();
		emailField.sendKeys(email);

		agetField.clear();
		agetField.sendKeys(age);

		salaryField.clear();
		salaryField.sendKeys(salary);

		departmentField.clear();
		departmentField.sendKeys(dept);

		submitButton.isEnabled();
		submitButton.click();
	}
	
	public ArrayList<String> verifyNewlyAddedRecord(String fName) {

		searchBox.clear();
		searchBox.sendKeys(fName);
		searchButton.isEnabled();
		searchButton.click();
		
		ArrayList<String> newData = new ArrayList<String>();

		for(int c=1; c<=tableColumns.size(); c++) {
			String newColumnXpath = "//div[@class='rt-tbody']/div[1]/div/div[" + c + "]";
			WebElement newRowElements = ldriver.findElement(By.xpath(newColumnXpath));

			newData.add(newRowElements.getText());
		}

		return newData;
	}
	
}
