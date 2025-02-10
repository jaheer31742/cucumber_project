
Feature: MyAccount
 
 Background: some common steps for every scenario
 		Given User launch the browser
    When Navigate to the url "https://tutorialsninja.com/demo/index.php?route=common/home"
    And User should click on the MyAccount button
    

 @smokeTest
  Scenario: User should Register Successful with valid inputs
    And User should click on the register link
    Then Verify the user is enter into the register page or not
    And User should enter the valid perdonal details and password and click on thee subscribe button "yes"
    And user should click on the privacy policy check box and click on the continue button
    And verify that user should register the account successfull
    Then click on the continue button
    And close browser
    
    
	@regressionTest
   Scenario: User should Login Successful with valid inputs
    And User should click on the Login link
    Then Verify the user is enter into the Login page or not
    And User should enter the valid email and password "moin316"
    Then click on the Login button
    And close browser
  

  
  