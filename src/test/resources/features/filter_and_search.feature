Feature: As a user, I should be able to use "Filter and search" functionality on Active Stream

  Background: For the scenarios in the feature file, user is expected to be on login page
    When Go to "UserURL".
    Then Valid username "MarketingMail", password "Password" information is entered and the sign In button is clicked.
    When user clicks on the search-filter box

  @sln @REM-1872
  Scenario: User should see my activity, work, favorite, announcements, and workflows options
    Then user should see these options
      | WORK          |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |
      | FAVORITES     |

  @sln @REM-1873
  Scenario: User should be able to add and remove fields
    When user clicks on the add field button
    And select Favorites field
    Then verify Favorites field selected
    And unselect Favorites field
    Then verify Favorites field unselected

  @sln @REM-1900
  Scenario: User should be able to save the filter and reset filters to default.(Selen)
    And click Save Filter button
    And write filter name "NEW"
    And click Save button
    Then verify user can add new filter
    When click edit and delete button
    And click Reset to default button
    Then user should see these options
      | WORK          |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |
      | FAVORITES     |


  @sln @REM-1876
  Scenario: User should be able to search by specifying date
    When user clicks date dropdown
    And select Yesterday option
    And user can clicks search button


  @sln @REM-1877
  Scenario: User should be able to search by specifying single type
    Given user clicks reset button
    When user clicks on the search-filter box
    And user clicks type box
    And select Posts option
    Then user can clicks search button

  @sln @REM-1898
  Scenario: User should be able to search by specifying multiple types
    Given user clicks reset button
    When user clicks on the search-filter box
    And user clicks type box
    And select Announcements and Polls as multiple options
    Then user can clicks search button

  @sln @REM-1899
  Scenario: when user click restore the default field and return default options
    And user clicks restore default fields
    And verify Date, Type, Author, To are displayed
    And user clicks on the add field button
    Then verify Favorites, Tag, Extranet fields unchecked as default

