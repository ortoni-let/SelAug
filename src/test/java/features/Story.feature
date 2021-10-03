Feature: Search

  Background: 
    Given user should launch browser
    And user goto google website

  Scenario Outline: Google searach for multiple data
    When user search for the "<searchTerm>" and "<anotherST>"
    Then page title should have "<searchTerm>"
    #And close the browser

    Examples: 
      | searchTerm | anotherST |
      | selenium   | Cucumber  |
      | playwright | bdd       |

  Scenario: Google search for Selenium
    When user search for the "selenium" and " testng"
    Then page title should have "selenium"
    #And close the browser
    
    
    
#	Scenario: Google search for Playwright
#		When user search for the "playwright"
#		Then page title should have "playwright"
#		And close the browser
