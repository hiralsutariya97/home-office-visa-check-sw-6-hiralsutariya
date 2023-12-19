package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.StartPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class CountryDropdownSteps {
    private DataTable dataTable;

    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }


    @Then("I can see the following country into dropdown")
    public void iCanSeeTheFollowingCountryIntoDropdown() {
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> list : userList) {
            System.out.println(list.get(0));
        }
    }
}

