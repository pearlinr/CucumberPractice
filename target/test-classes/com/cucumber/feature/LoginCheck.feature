Feature: AutomationPractice login functionality of the application
Scenario: Validate the email Id and password field with valid email id and password.
##Given User need to launch the browser and load the AutomationPratice homepage
Then User need to validate the page logo
And User need to validate the signin button and click
And User need to validate the email id field and enter the valid email id "della@gmail.com"
And User need to validate the password feild and enter the valid password "emmu@26"
And User need to validate the submit button and click
And User need to validate the username "Della Emmu" and pass the message "Logged in succesfully"
And User need to logout the page and validate signin button