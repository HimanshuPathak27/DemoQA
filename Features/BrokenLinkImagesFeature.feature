Feature: BrokenLinkImages_Element

Background: Steps common for all scenarios
		Given User launched a Browser
		When User opens url "https://demoqa.com"
		Then User verify title of landing Page "DEMOQA"
		When User cliks on Elements tab

	Scenario: Validate the BrokenLinkImages component under Elements Tile
		Then User clicks on Broken Link Images button on left rail elements
		And User verifies the header of Broken Link Images page "Broken Links - Images"
		And User verify the valid image
		#And User verify the broken image
		And User clicks on valid link and verify the response
		And User clicks on broken link and verify the response
		And User close the browser