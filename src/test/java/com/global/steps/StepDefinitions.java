package com.global.steps;

import com.global.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitions extends BaseTest {

    @Before()
    public void setUp() {
        webDriver();
        initPageObjects();
        initPageObjects();
    }


    @Given("I open calc page")
    public void i_open_main_page() {
        basicPage.openPage();
    }

    @After
    public void
    close_connection() {
            BaseTest.closeConnection();
        }

    @Then("I choose the country {string}")
    public void i_choose_the_country(String country) {
        basicPage.chooseTheCountry(country);
    }

    @Then("I choose the VAT {string}")
    public void i_choose_the_VAT(String vat) {
        basicPage.chooseTheVat(vat);
    }

    @And("I verify that percentage coefficient is present for Price without vat")
    public void i_verify_that_percentage_coefficient_is_present_for_price_without_vat() {
        assert  basicPage.isCoefficientWithoutVatPresent();
    }

    @And("I verify that percentage coefficient is present for Price include vat")
    public void i_verify_that_percentage_coefficient_is_present_for_price_include_vat() {
        assert  basicPage.isCoefficientIncludeVatPresent();
    }

    @Then("I enter the test value into the Price without VAT field")
    public void i_enter_the_test_value_into_the_price_without_VAT_field() {
        basicPage.enterTheTestValue();
    }
}


