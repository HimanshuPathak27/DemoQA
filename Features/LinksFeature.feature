Feature: Links_Element

Background: Steps common for all scenarios
		Given User launched a Browser
		When User opens url "https://demoqa.com"
		Then User verify title of landing Page "DEMOQA"
		When User cliks on Elements tab

	Scenario: Validate the Links component under Elements Tile
		Then User clicks on Links button on left rail elements
		And User clicks on Created API call link and validate the Response Code "201" and Response Message "Created"
		And User clicks on No Content API call link and validate the Response Code "204" and Response Message "No Content"
		And User clicks on Moved API call link and validate the Response Code "301" and Response Message "Moved Permanently"
		And User clicks on Bad Request API call link and validate the Response Code "400" and Response Message "Bad Request"
		And User clicks on Unauthorized API call link and validate the Response Code "401" and Response Message "Unauthorized"
		And User clicks on Forbidden API call link and validate the Response Code "403" and Response Message "Forbidden"
		And User clicks on Not Found API call link and validate the Response Code "404" and Response Message "Not Found"
		And User close the browser