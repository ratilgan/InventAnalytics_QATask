@test
Feature: E2E solution for the Invent Analytics QA Task

  Scenario Outline: Search, add and delete books to the collection
    # Login
    Given the user navigates to "https://demoqa.com/books"
    And clicks the login button
    When fills the "username" and "password" inputs and logs in
    # Assertion of login
    Then the "username" should appear on the top-right corner

    # Search for a book
    When the user searches for "<Book Name>"
    # Assertion of search function
    Then "<Book Name>" should be listed

    # Adding a book
    When the user clicks on the "<Book Name>"
    And adds the book to the collection
    # 1st assertion of adding book function
    Then "Book added to your collection." message should pop-out
    When the user goes to the profile page
    # 2nd assertion of adding book function
    Then "<Book Name>" should be listed

    # Changing the number of rows
    When the user selects the row number as "10"
    # Assertion of row number change
    Then 10 rows should be listed

    # Deleting a book
    When the user deletes the book
    # 1st assertion of deleting a book
    Then "Book deleted." message should appear
    # 2nd assertion of deleting a book
    And "No rows found" text should be visible

    # Logout
    When the user logs out
    Then should be redirected to "https://demoqa.com/login"
    And username and password input boxes should be visible

    Examples:
      | Book Name                                 |
      | Git Pocket Guide                          |
      | Learning JavaScript Design Patterns       |
      | Designing Evolvable Web APIs with ASP.NET |
      | Speaking JavaScript                       |
      | You Don't Know JS                         |
      | Programming JavaScript Applications       |
      | Eloquent JavaScript, Second Edition       |
      | Understanding ECMAScript 6                |