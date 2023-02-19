package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class GoogleStepDefinitions {


    @When("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://google.com");
    }
    @Then("User should see title is Google.")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle= "Google";

        Assert.assertEquals(expectedTitle, actualTitle);
    }


}
