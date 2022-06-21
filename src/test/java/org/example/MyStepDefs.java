package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDefs {

    HomePage homePage= new HomePage();
    RegstrationPage regstrationPage = new RegstrationPage();
    RegstrationCompletedPage regstrationCompletedPage = new RegstrationCompletedPage();

    @Given(":when i click on registration button")
    public void when_i_click_on_registration_button() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegstrationButton();


    }

    @When(": when i enter my registration details")
    public void when_i_enter_my_registration_details() {
        // Write code here that turns the phrase above into concrete actions
        regstrationPage.userEnterRegstationDeatiles();

    }

    @Then(": i should able to register successfully")
    public void i_should_able_to_register_successfully() {
        // Write code here that turns the phrase above into concrete actions
        regstrationCompletedPage.userVerifyTheRegstrationSucessfull();

    }

    @Given(": I am on Homepage")
    public void i_am_on_homepage() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When(": I click on {string} link form top header menu")
    public void i_click_on_link_form_top_header_menu(String category_name) {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnCategoryLink(category_name);

    }
    @Then(": i should able to  navigate successfully to related {string} category page")
    public void i_should_able_to_navigate_successfully_to_related_category_page(String category_url) {
        // Write code here that turns the phrase above into concrete actions
        Utils.verifyCurrentUrl(category_url);
    }

}
