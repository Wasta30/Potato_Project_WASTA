Feature: Login functionality

	Scenario :AC1-Users can log in with valid credentials.
		When user goes to the login page
		And  user enters valid "salesmanager15@info.com" and "salesmanager"
		Then user clicks on login button or press  enter
	
	@UPGNX10-227

	Scenario Outline:  AC1-Users can log in with valid credentials.
	    When user goes to the login page
		And  user enters valid "<Email>" and "<Password>"
		Then user clicks on login button or press  enter


		Examples: Email-Password
			| Email                   | Password     |
			| salesmanager5@info.com  | salesmanager |
			| salesmanager15@info.com | salesmanager |
			| salesmanager20@info.com | salesmanager |
			| salesmanager25@info.com | salesmanager |



	@UPGNX10-252
		Scenario Outline:
		When user goes to the login page
		And  user enters invalid email "<Email>" and valid password "<Password>"
		And user enters valid email "<Email>" and invalid password "<Password>"
		Then user should see error message Wrong login/password

		Examples: Email-Password
			| Email                    | Password     |
			| salesmanager4@info.com   | salesmanager |
			| salesmanager165@info.com | salesmanager |
			| salesmanager5@info.com   | Salesmanager |
			| salesmanager105@info.com | salesManager |