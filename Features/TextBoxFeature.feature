Feature: TextBoxes_Element

Background: Steps common for all scenarios
		Given User launched a Browser
		When User opens url "https://demoqa.com"
		Then User verify title of landing Page "DEMOQA"
		When User cliks on Elements tab

	Scenario: Validate the TextBoxes component under Elements Tile
		Then User clicks on Text Box button on left rail elements
		And User verifies the header of textboxs page "Text Box"
		And User validate the inner text of all the textboxes as "Full Name" "name@example.com" "Current Address" ""
		And User enters all the values under the textboxes
		And User clicks on Submit button
		And User close the browser