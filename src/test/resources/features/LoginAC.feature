@runTest
Feature: Login functionality


	@UPGNX10-227

	Scenario Outline:  AC1-Users can log in with valid credentials.
	    When user goes to the login page
		And  user enters valid "<Email>" and "<Password>"
		Then user clicks on login button or press  enter
		Then user is on the home page


		Examples: Email-Password
			| Email                   | Password     |
			| salesmanager15@info.com | salesmanager |
			| salesmanager20@info.com | salesmanager |
			| salesmanager25@info.com | salesmanager |



	@UPGNX10-252

		Scenario:AC2- "Wrong login/password" message should be displayed for invalid credentials (valid username-invalid password and invalid username-valid password)
		When user goes to the login page
		And  user enters invalid email "Salesmanager03@info.com"
		And user enters valid password "salesmanager"
		And  user clicks on login button or press  enter
		Then user sees Wrong login or password message displayed
		And user enters valid email "Salesmanager15@info.com"
		And user enters invalid password "SalesManager"
		Then user clicks on login button or press  enter
		Then user sees Wrong login or password message displayed



	@UPGNX10-253

	Scenario: AC3- "Please fill in this field" message should be displayed if the password or username is empty
		When user goes to the login page
		And  user leaves password button empty
		Then  user clicks on login button or press  enter
		Then user should see message Please fill in this field
		And  user leaves email box empty
		Then user clicks on login button or press  enter
		Then user should see message Please fill in this field



	@UPGNX10-254
	Scenario: AC4- User should see the password in bullet signs by default while typing (like ****)
		When user goes to the login page
		And user enters valid password "salesmanager"
		And  user should see the password in bullet ****


	@UPGNX10-255
	Scenario: AC5- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
		When user goes to the login page
		And  user enters valid email "salesmanager15@info.com"
		And  user enters valid password "salesmanager"
		Then user checks the enter keys works the same as login button







