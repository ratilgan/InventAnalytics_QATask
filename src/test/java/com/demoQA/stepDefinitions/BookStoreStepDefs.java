package com.demoQA.stepDefinitions;

import com.demoQA.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookStoreStepDefs {

    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String url) {
        Driver.get().get(url);
    }

    @Given("clicks the login button")
    public void clicks_the_login_button() {

    }
    @When("fills the {string} and {string} inputs")
    public void fills_the_and_inputs(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the {string} should appear on the top-right corner")
    public void the_should_appear_on_the_top_right_corner(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user searches for {string}")
    public void the_user_searches_for(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("{string} should be listed")
    public void should_be_listed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks on the {string}")
    public void the_user_clicks_on_the(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("adds the book to the collection")
    public void adds_the_book_to_the_collection() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("{string} message should pop-out")
    public void message_should_pop_out(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
