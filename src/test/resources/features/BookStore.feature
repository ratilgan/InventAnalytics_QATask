@test
Feature: E2E solution for the Invent Analytics QA Task

  Scenario Outline: Search, add and delete books to the collection

    Given the user navigates to "https://demoqa.com/books"
    And clicks the login button
    When fills the "username" and "password" inputs and logs in
    Then the "username" should appear on the top-right corner

    When the user searches for "<Book Name>"
    Then "<Book Name>" should be listed

    When the user clicks on the "<Book Name>"
    And adds the book to the collection
    Then "Book added to your collection." message should pop-out
    When the user goes to the profile page
    Then "<Book Name>" should be listed

    When the user selects the row number as "10"
    Then 10 rows should be listed

    When the user deletes the book
    Then "Book deleted." message should appear
    And "No rows found" text should be visible

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


