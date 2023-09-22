Feature: As a user, I should be able to use "Filter and search" functionality on Active Stream

  Background: For the scenarios in the feature file, user is expected to be on login page
    When Go to "UserURL".
    Then Valid username "MarketingMail", password "Password" information is entered and the sign In button is clicked.
    When user clicks on the search-filter box

  @sln
  Scenario: User should see my activity, work, favorite, announcements, and workflows options
    Then user should see these options
      | WORK          |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |
      | FAVORITES     |

  @sln
  Scenario: User should be able to add and remove fields
    When user clicks on the add field button
    And select Favorites field
    Then verify Favorites field selected
    And unselect Favorites field
    Then verify Favorites field unselected

  @sln
  Scenario: User should be able to save and remove new filter
    And click Save Filter button
    And write filter name "NEW"
    And click Save button
    Then verify user can add new filter
    And click edit and delete button
    And click Reset to default button
   # Then verify NEW filter is not display


  @sln
  Scenario: User should be able to search by specifying date
    When user clicks date dropdown
    And select Yesterday option
    And user clicks search button


  @sln
  Scenario: User should be able to search by specifying single type
    Given user clicks reset button
    And user clicks on the search-filter box
    When user clicks type box
    And select Posts option
    And user clicks search button

  @sln
  Scenario: User should be able to search by specifying multiple types
    Given user clicks reset button
    And user clicks on the search-filter box
    When user clicks type box
    And select Announcements and Polls as multiple options
    And user clicks search button
@sln
  Scenario: when user click restore the default field and return default options
    And user clicks restore default fields
    And verify Date, Type, Author, To are displayed
    And user clicks on the add field button
    Then verify Favorites, Tag, Extranet fields unchecked as default