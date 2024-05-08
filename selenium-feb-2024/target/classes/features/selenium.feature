Feature: Orange Hrl application login

   Scenario: Verify user login successfully
      Given I navigated url on browser
      When i enter username into user input field
      And I enter password in password field
      And I click on login button
      Then 	 verify user login successfully
      And verify all menus option
           | Header      |
           | Admin       |
           | PIM         |
           | Leave       |
           | Time        |
           | Recruitment |