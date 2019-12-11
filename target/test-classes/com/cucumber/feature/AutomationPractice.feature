Feature: AutomationPractice login functionality of the application
Scenario: Validate the email Id and password feild with valid email id and password.
##Given User need to launch the browser and load the AutomationPratice homepage
Then User need to validate the page logo
And User need to validate the signin button and click
And User need to validate the email id field and enter the valid email id
And User need to validate the password feild and enter the valid password
And User need to validate the submit button and click
Then User need to move the mouse to the product catagery women
And User need to select Blouse catagery
And User need to select the product by clicking more button
And User need to validate the product title
And User need to select the quantity,size and colour of the product
And User need to click the add to cart button
Then User need to proceed to checkout to next page
And User need to scroll the page down
##Then User need to proceed to checkout to next page2
And User need to validate the address for shipping
##Then User need to proceed to checkout to next page3
And User need to select the checkbox
##And User need to proceed to checkout to next page4
Then User need to choose the payment option
##And User need to proceed to checkout to next page5
Then User need to check whether orderplaced or not and validate the order text
And User need to go to order history and get order number
And User need to logout the page and validate signin button
##Then User need to close the browser

