Feature: Buttons_Element

Background: Steps common for all scenarios
		Given User launched a Browser
		When User opens url "https://demoqa.com"
		Then User verify title of landing Page "DEMOQA"
		When User cliks on Elements tab

	Scenario: Validate the Buttons component under Elements Tile
		Then User clicks on Buttons button on left rail elements
		And User perform double click action on Double Click Me button and verify the Result "You have done a double click"
		And User perform right click action on Right Click Me button and verify the Result "You have done a right click"
		And User perform click action on Click Me button and verify the Result "You have done a dynamic click"
		And User close the browser