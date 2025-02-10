
Feature: Add monitor product to the cart
  

 
  Scenario: user should add monitor product to the cart
    Given User launch the browser
    When Navigate to the url "https://tutorialsninja.com/demo/index.php?route=common/home"
    And User should click on the MyAccount button
    And User should click on the register link
    Then Verify the user is enter into the register page or not
    And User should enter the valid perdonal details and password and click on thee subscribe button "yes"
    And user should click on the privacy policy check box and click on the continue button
    And verify that user should register the account successfull
    Then click on the continue button    
    And click on the home button
    And verify the user is enter into the home page or not
    Then user can mouse hover to the component module
    And click on the monitor sub module
    Then verify user is enter into the monitor module or not
    And click on the product applie cinema
    Then verify the user enter into the apple cinema page or not
    And fetch the details of the page and perform actions
    And click on the item cart button and view cart button
    Then verify the user enter into the shopping cart page or not
    And fetch the details of the shopping page and check out
    And User should click on the MyAccount button
    And click on the logout
    And close browser
    
    
  