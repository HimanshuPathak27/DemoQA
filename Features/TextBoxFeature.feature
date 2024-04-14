Feature: TextBoxes_Element

	Scenario: Validate the TextBoxes component under Elements Tile
		Given User Already launched a Browser
		When User opens url "https://demoqa.com"
		Then User verify title of landing Page "DEMOQA"
		When User cliks on Elements tab
		Then User clicks on Text Box button on left rail elements
		And User enters all the values under the textboxes
		And User clicks on Submit button
		And User close the browser