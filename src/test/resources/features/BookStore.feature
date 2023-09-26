@test
Feature: Solution for the QA Task

  Background: the user logs in to the app
    Given the user navigates to "https://demoqa.com/books"
    And clicks the login button
    When fills the "username" and "password" inputs
    And clicks the login button
    Then the "username" should appear on the top-right corner

  Scenario Outline: Searching and adding books to the collection
    When the user searches for "<Book Name>"
    Then "<Book Name>" should be listed
    When the user clicks on the "<Book Name>"
    And adds the book to the collection
    Then "Book added to your collection." message should pop-out

    Examples:
      | Book Name                                 |
      | Git Pocket Guide                          |
      | Learning JavaScript Design Patterns       |
      | Designing Evolvable Web APIs with ASP.NET |
      | Speaking JavaScript                       |
      | You Don't Know JS                         |
#      | Programming JavaScript Applications       |
#      | Eloquent JavaScript, Second Edition       |
#      | Understanding ECMAScript 6                |
