package StepDefinitions;

import java.util.ArrayList;

import PageObjects.WebTablePage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class WebTableFeature_StepDefinitions extends BaseClass{

	@Then("User clicks on Web Tables button on left rail elements")
	public void user_clicks_on_web_tables_button_on_left_rail_elements() {
		webTablePage = new WebTablePage(ldriver);

		webTablePage.clickWebTableButton();
		log.info("PASSED | Webtable Button is successfully Validated");
	}

	@Then("User verify the Column headers of webtable as {string} {string} {string} {string} {string} {string} {string}")
	public void user_verify_the_column_headers_of_webtable_as(String fName, String lName, String age, String email, String salary, String dept, String action) {

		ArrayList<String> columnHeaders = webTablePage.verifyColumnHeaders();

		for(String header : columnHeaders) {
			if(header.equals(fName)) log.info("PASSED | First Name header validated");
			else if(header.equals(lName)) log.info("PASSED | Last Name header validated");
			else if(header.equals(age)) log.info("PASSED | Age header validated");
			else if(header.equals(email)) log.info("PASSED | Email header validated");
			else if(header.equals(salary)) log.info("PASSED | Salary header validated");
			else if(header.equals(dept)) log.info("PASSED | Department header validated");
			else if(header.equals(action)) log.info("PASSED | Action header validated");
		}
		log.info("PASSED | Headers of all the Column of Webtable are Validated");
	}

	@Then("User edit the details on Row-II of table {string} {string} {string} {string} {string} {string}")
	public void user_edit_the_details_on_row_ii_of_table(String fName, String lName, String age, String email, String salary, String dept) {
		webTablePage.UpdateRecord2(fName, lName, email, age, salary, dept);

		log.info("PASSED | Row-2 is Updated in the table");
	}

	@Then("User verify the updated details of Row-II  {string} {string} {string} {string} {string} {string}")
	public void user_verify_the_updated_details_of_row_ii(String fName, String lName, String age, String email, String salary, String dept) {
		ArrayList<String> row2Data = webTablePage.verifyUpdatedRow2Record();

		for(String data : row2Data) {
			if(data.equals(fName)) log.info("PASSED | First Name validated");
			else if(data.equals(lName)) log.info("PASSED | Last Name validated");
			else if(data.equals(age)) log.info("PASSED | Age validated");
			else if(data.equals(email)) log.info("PASSED | Email validated");
			else if(data.equals(salary)) log.info("PASSED | Salary validated");
			else if(data.equals(dept)) log.info("PASSED | Department validated");
		}
		log.info("PASSED | Updated data of Row-2 of Webtable is Validated");
	}

	@Then("User delete the record-II")
	public void user_delete_the_record_ii() {
		webTablePage.deleteRecord2();
		log.info("PASSED | Row2 Record is deleted");
	}

	@Then("User add a new record {string} {string} {string} {string} {string} {string}")
	public void user_add_a_new_record(String fName, String lName, String age, String email, String salary, String dept) {
		webTablePage.addNewRecord(fName, lName, email, age, salary, dept);
		
		log.info("PASSED | New Record is added in the table");
	}

	@Then("User verify the new record in table {string} {string} {string} {string} {string} {string}")
	public void user_verify_the_new_record_in_table(String fName, String lName, String age, String email, String salary, String dept) {
		webTablePage.verifyNewlyAddedRecord(fName);
		
		ArrayList<String> newData = webTablePage.verifyUpdatedRow2Record();

		for(String data : newData) {
			if(data.equals(fName)) log.info("PASSED | First Name validated");
			else if(data.equals(lName)) log.info("PASSED | Last Name validated");
			else if(data.equals(age)) log.info("PASSED | Age validated");
			else if(data.equals(email)) log.info("PASSED | Email validated");
			else if(data.equals(salary)) log.info("PASSED | Salary validated");
			else if(data.equals(dept)) log.info("PASSED | Department validated");
		}
		log.info("PASSED | Newly Added Data on Webtable is Validated");
	}

}
