Feature: RadioButtons_Element

Background: Steps common for all scenarios
		Given User launched a Browser
		When User opens url "https://demoqa.com"
		Then User verify title of landing Page "DEMOQA"
		When User cliks on Elements tab

	Scenario: Validate the Radio buttons component under Elements Tile
		Then User clicks on Radio button on left rail elements
		And Select Yes radio button and verify the Selected value "Yes"
		And Select Impressive radio button and verify the Selected value "Impressive"
		And User verifies the No radio button to be disabled
		And User close the browser