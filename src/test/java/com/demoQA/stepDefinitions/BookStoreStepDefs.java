package com.demoQA.stepDefinitions;

import com.demoQA.pages.BookDetailPage;
import com.demoQA.pages.LandingPage;
import com.demoQA.pages.LoginPage;
import com.demoQA.pages.ProfilePage;
import com.demoQA.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookStoreStepDefs {

    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();
    BookDetailPage bookDetailPage = new BookDetailPage();
    ProfilePage profilePage = new ProfilePage();

    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String url) {
        Driver.get().get(url);
    }

    @Given("clicks the login button")
    public void clicks_the_login_button() {
        landingPage.loginButton.click();
    }

    @When("fills the {string} and {string} inputs and logs in")
    public void fills_the_and_inputs_and_logs_in(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("the {string} should appear on the top-right corner")
    public void the_should_appear_on_the_top_right_corner(String expectedUsername) {
        landingPage.verifyTheUserName(expectedUsername);
    }

    @When("the user searches for {string}")
    public void the_user_searches_for(String bookName) {
        landingPage.searchInputBox.sendKeys(bookName);
    }

    @Then("{string} should be listed")
    public void should_be_listed(String expectedBookName) {
        landingPage.verifyTheListedBookName(expectedBookName);
    }

    @When("the user clicks on the {string}")
    public void the_user_clicks_on_the(String bookName) {
        landingPage.clickOnTheBook(bookName);
    }

    @When("adds the book to the collection")
    public void adds_the_book_to_the_collection() {
        bookDetailPage.clickAddToCollectionButton();
    }

    @Then("{string} message should pop-out")
    public void message_should_pop_out(String expectedMessage) {
        bookDetailPage.assertTheSuccessMessage(expectedMessage);
    }

    @When("the user goes to the profile page")
    public void the_user_goes_to_the_profile_page() {
        bookDetailPage.clickProfilePageLink();
    }

    @When("the user selects the row number as {string}")
    public void the_user_selects_the_row_number_as(String expectedRowNumber) {
        profilePage.changeTheRowNumber(expectedRowNumber);
    }

    @Then("{int} rows should be listed")
    public void rows_should_be_listed(int expectedNumberOfRows) {
        profilePage.verifyTheRowNumberChange(expectedNumberOfRows);
    }

    @When("the user deletes the book")
    public void the_user_deletes_the_book() {
        profilePage.deleteAddedBook();
    }

    @Then("{string} message should appear")
    public void message_should_appear(String expectedSuccessMessage) {
        profilePage.confirmTheDelete(expectedSuccessMessage);
    }

    @Then("{string} text should be visible")
    public void text_should_be_visible(String expectedMessage) {
        profilePage.verifyTheNoRowsFoundMessage(expectedMessage);
    }

    @When("the user logs out")
    public void the_user_logs_out() {
        profilePage.clickToLogout();
    }
    @Then("should be redirected to {string}")
    public void should_be_redirected_to(String expectedLoginPageUrl) {
        loginPage.verifyLoginPageOpened(expectedLoginPageUrl);
    }
    @Then("username and password input boxes should be visible")
    public void username_and_password_input_boxes_should_be_visible() {
        loginPage.verifyUsernameAndPasswordInputBoxesAreVisible();
    }
}
