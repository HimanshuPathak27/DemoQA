package StepDefinitions;

import org.testng.Assert;

import PageObjects.CheckBoxPage;
import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class CheckBoxFeature_StepDefinitions extends BaseClass{

	@Then("User clicks on Check Box button on left rail elements")
	public void user_clicks_on_check_box_button_on_left_rail_elements() {
	    checkBoxPage = new CheckBoxPage(ldriver);
	    
	    checkBoxPage.clickCheckBoxButton();
	    log.info("PASSED | Checkbox button is selected Successfully");
	}

	@Then("Select Notes Checkbox under Desktop")
	public void select_notes_checkbox_under_desktop() {
	    checkBoxPage.selectNotesCheckBox();
	    log.info("PASSED | Notes Checkbox is selected Successfully");
	}

	@Then("Select React Checkbox under WorkSpace under Documents")
	public void select_react_checkbox_under_work_space_under_documents() {
	    checkBoxPage.selectReactCheckBox();
	    log.info("PASSED | React Checkbox is selected Successfully");
	}

	@Then("Select Excel File.doc Checkbox under Downloads")
	public void select_excel_file_doc_checkbox_under_downloads() {
	    checkBoxPage.selectExcelFilesCheckBox();
	    log.info("PASSED | Excel Files Checkbox is selected Successfully");
	}

	@Then("User verifies selected values {string} {string} {string}")
	public void user_verifies_selected_values(String expSelectedValue1, String expSelectedValue2, String expSelectedValue3) {
	    String[] actSelectedValues = checkBoxPage.validateSelection();
	    
	    Assert.assertEquals(expSelectedValue1, actSelectedValues[0], "Passed | First Value validated");
	    Assert.assertEquals(expSelectedValue2, actSelectedValues[1], "Passed | Second Value validated");
	    Assert.assertEquals(expSelectedValue3, actSelectedValues[2], "Passed | Third Value validated");
	    
	    log.info("PASSED | Selected checkboxes are validated Successfully");
	}
	
}
