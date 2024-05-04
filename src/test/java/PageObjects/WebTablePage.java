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

	// Constructor to instantiate Webdriver instance
	public WebTablePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);

		js = (JavascriptExecutor) ldriver;
	}

	// Locating Elements
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
	WebElement ageField;

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

	// Click on Web Tables button on left rail
	public void clickWebTableButton() {

		try {
			if(webTableButton.isDisplayed() && webTableButton.isEnabled()) {
				try {
					webTableButton.click();
				}
				catch (Exception e) {
					log.info("FAILED | Web Tables button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Web Tables button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	//Handling Web Table
	public ArrayList<String> verifyColumnHeaders() {

		ArrayList<String> columnHeaders = new ArrayList<String>();

		for(int h=1; h<=tableHeaders.size(); h++) {
			String tableHeaderXpath = "//div[@class='rt-tr']/div[" + h + "]";
			WebElement tableHeaderData = ldriver.findElement(By.xpath(tableHeaderXpath));

			columnHeaders.add(tableHeaderData.getText());
		}

		return columnHeaders;
	}

	// Update Record-2 on the webtable
	public void UpdateRecord2(String firstName, String lastName, String email, String age, String salary, String dept) {

		js.executeScript("arguments[0].scrollIntoView()", editRecord2Button);

		try {
			if(editRecord2Button.isDisplayed() && editRecord2Button.isEnabled()) {
				try {
					editRecord2Button.click();
				}
				catch (Exception e) {
					log.info("FAILED | Edit button on record-2, click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Edit button on record-2 is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			if(firstNameField.isDisplayed() && firstNameField.isEnabled()) {
				firstNameField.clear();
				firstNameField.sendKeys(firstName);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | First Name text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			if(lastNameField.isDisplayed() && lastNameField.isEnabled()) {
				lastNameField.clear();
				lastNameField.sendKeys(lastName);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Last Name text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}


		try {
			if(emailField.isDisplayed() && emailField.isEnabled()) {
				emailField.clear();
				emailField.sendKeys(email);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Email text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			if(ageField.isDisplayed() && ageField.isEnabled()) {
				ageField.clear();
				ageField.sendKeys(age);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Age text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			if(salaryField.isDisplayed() && salaryField.isEnabled()) {
				salaryField.clear();
				salaryField.sendKeys(salary);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Salary text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			if(departmentField.isDisplayed() && departmentField.isEnabled()) {
				departmentField.clear();
				departmentField.sendKeys(dept);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Department text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
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

	// Verify the updated records of Row-2
	public ArrayList<String> verifyUpdatedRow2Record() {

		ArrayList<String> row2Data = new ArrayList<String>();

		for(int c=1; c<=tableColumns.size(); c++) {
			String row2ColumnsXpath = "//div[@class='rt-tbody']/div[2]/div/div[" + c + "]";
			WebElement row2Elements = ldriver.findElement(By.xpath(row2ColumnsXpath));

			try {
				row2Data.add(row2Elements.getText());
			}
			catch (Exception e) {
				log.info("FAILED | Unable to fetch updated data from row-2");
				log.error("ERROR | " + e.getMessage() + " | " + e);
			}
		}

		return row2Data;
	}

	//Delete Record in row-2
	public void deleteRecord2() {

		try {
			if(deleteRecord2Button.isDisplayed() && deleteRecord2Button.isEnabled()) {
				try {
					deleteRecord2Button.click();
				} 
				catch (Exception e) {
					log.info("FAILED | Delete Record2 button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Delete Record2 button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	// Add a new Record in webtable
	public void addNewRecord(String firstName, String lastName, String email, String age, String salary, String dept) {

		try {
			if(addNewButton.isDisplayed() && addNewButton.isEnabled()) {
				try {
					addNewButton.click();
				} 
				catch (Exception e) {
					log.info("FAILED | Add New Record button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Add New Record button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			if(firstNameField.isDisplayed() && firstNameField.isEnabled()) {
				firstNameField.clear();
				firstNameField.sendKeys(firstName);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | First Name text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			if(lastNameField.isDisplayed() && lastNameField.isEnabled()) {
				lastNameField.clear();
				lastNameField.sendKeys(lastName);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Last Name text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}


		try {
			if(emailField.isDisplayed() && emailField.isEnabled()) {
				emailField.clear();
				emailField.sendKeys(email);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Email text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			if(ageField.isDisplayed() && ageField.isEnabled()) {
				ageField.clear();
				ageField.sendKeys(age);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Age text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			if(salaryField.isDisplayed() && salaryField.isEnabled()) {
				salaryField.clear();
				salaryField.sendKeys(salary);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Salary text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			if(departmentField.isDisplayed() && departmentField.isEnabled()) {
				departmentField.clear();
				departmentField.sendKeys(dept);
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Department text box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
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

	// Verify the newly added record
	public ArrayList<String> verifyNewlyAddedRecord(String fName) {

		try {
			if(searchBox.isDisplayed() && searchBox.isEnabled()) {
				searchBox.clear();
				searchBox.sendKeys(fName);
			}
		}
		catch (Exception e) {
			log.info("FAILED | Search box is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		try {
			if(searchButton.isDisplayed() && searchButton.isEnabled()) {
				try {
					searchButton.click();
				}
				catch (Exception e) {
					log.info("FAILED | Search button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Search button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		ArrayList<String> newData = new ArrayList<String>();

		for(int c=1; c<=tableColumns.size(); c++) {
			String newColumnXpath = "//div[@class='rt-tbody']/div[1]/div/div[" + c + "]";
			WebElement newRowElements = ldriver.findElement(By.xpath(newColumnXpath));

			try {
				newData.add(newRowElements.getText());
			}
			catch (Exception e) {
				log.info("FAILED | Unable to fetch data from newly added record");
				log.error("ERROR | " + e.getMessage() + " | " + e);
			}
		}

		return newData;
	}

}
