package org.example.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.WalesPage;
import org.testng.Assert;

import java.util.List;

public class walesSteps {
    @Given("^User is on Home Page$")
    public void userIsOnHomePage() {
    }

    @When("^user clicks start button$")
    public void userClicksStartButton() {
        new WalesPage().clickonstart();
    }


    @And("^user select diabetes status as \"([^\"]*)\"$")
    public void userSelectDiabetesStatusAs() {
        new WalesPage().clickonno();
    }


    @Then("^user should get a result that \"([^\"]*)\"$")
    public void userShouldGetAResultThat(String text) {
        Assert.assertTrue(new WalesPage().verifytext().contains(text));
    }

    @And("^user selects country live in as Wales$")
    public void userSelectsCountryLiveInAsWales() {
        new WalesPage().clickonwales();
    }

    @And("^user selects GP practice location in scotland or Wales as Yes$")
    public void userSelectsGPPracticeLocationInScotlandOrWalesAsYes() {
        new WalesPage().clickonyes();
    }

    @And("^user clicks next button$")
    public void userClicksNextButton() {
        new WalesPage().clickonstart();
    }

    @And("^user select country of dental practice as Wales$")
    public void userSelectCountryOfDentalPracticeAsWales() {
        new WalesPage().clickonwales();

    }


    @And("^user select  partnership status as Yes$")
    public void userSelectPartnershipStatusAsYes() {
        new WalesPage().clickonyes();
    }

    @And("^user select tax claim status as No$")
    public void userSelectTaxClaimStatusAsNo() {
        new WalesPage().clickonno();
    }

    @And("^user select Maternity details as No$")
    public void userSelectMaternityDetailsAsNo() {
        new WalesPage().clickonno();
    }

    @And("^user select war pensioner and injury details status as No$")
    public void userSelectWarPensionerAndInjuryDetailsStatusAsNo() {
        new WalesPage().clickonno();
    }

    @And("^user select diabetes status as No$")
    public void userSelectDiabetesStatusAsNo() {
        new WalesPage().clickonno();
    }

    @And("^user select glaucoma status as No$")
    public void userSelectGlaucomaStatusAsNo() {
        new WalesPage().clickonno();
    }

    @And("^user select care home details as No$")
    public void userSelectCareHomeDetailsAsNo() {
        new WalesPage().clickonno();
    }

    @And("^user select financial details as No$")
    public void userSelectFinancialDetailsAsNo() {
        new WalesPage().clickonno();
    }

    @Then("^verify \"([^\"]*)\"$")
    public void verify(String age) {
        Assert.assertTrue(new WalesPage().verifyunder16().contains(age));
    }


    @And("^user enters date of birth$")
    public void userEntersDateOfBirth() {
    }

    @And("^user enters date of birth \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userEntersDateOfBirth(String d, String m, String y) {
        new WalesPage().enterDay(d);
        new WalesPage().enterMonth(m);
        new WalesPage().enterYear(y);
    }

    @Then("^user should get based on the age result that \"([^\"]*)\"$")
    public void userShouldGetBasedOnTheAgeResultThat(String age) {
        Assert.assertEquals(age, new WalesPage().verifyunder());

    }

}

