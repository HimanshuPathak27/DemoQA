Feature: WebTables_Element

Background: Steps common for all scenarios
		Given User launched a Browser
		When User opens url "https://demoqa.com"
		Then User verify title of landing Page "DEMOQA"
		When User cliks on Elements tab

	Scenario: Validate the WebTables component under Elements Tile
		Then User clicks on Web Tables button on left rail elements
		And User verify the Column headers of webtable as "First Name" "Last Name" "Age" "Email" "Salary" "Department" "Action"
		And User edit the details on Row-II of table "Ellise" "Perry" "27" "ep@example.com" "1000000" "CCKTR"
		And User verify the updated details of Row-II  "Ellise" "Perry" "27" "ep@example.com" "1000000" "CCKTR"
		And User delete the record-II
		And User add a new record "Kittu" "Sharma" "25" "ks@example.com" "1" "Berozgar"
		And User verify the new record in table "Kittu" "Sharma" "25" "ks@example.com" "1" "Berozgar"
		And User close the browser