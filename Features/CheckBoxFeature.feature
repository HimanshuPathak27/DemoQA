Feature: CheckBoxes_Element

Background: Steps common for all scenarios
		Given User launched a Browser
		When User opens url "https://demoqa.com"
		Then User verify title of landing Page "DEMOQA"
		When User cliks on Elements tab

	Scenario: Validate the TextBoxes component under Elements Tile
		Then User clicks on Check Box button on left rail elements
		And Select Notes Checkbox under Desktop
		And Select React Checkbox under WorkSpace under Documents
		And Select Excel File.doc Checkbox under Downloads
		And User verifies selected values "notes" "react" "excelFile"
		And User close the browser