package au.com.anz.thilini.borrowingpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by LakinduMac on 20/10/19.
 */
public class StartOverButtonSteps {

    private BorrowingPage borrowingPage;

    public StartOverButtonSteps() {
        this.borrowingPage = new BorrowingPage();
    }

    @Given("^the user has selected start over button$")
    public void theUserNavigatestoPage() throws Throwable {
        this.borrowingPage.goToBorrowingPage();
    }

    @When("^user enters field values$")
    public void theUserEnterFieldValuesAndClickCalculate() throws Throwable {
        this.borrowingPage.addApplicationtypeSingle();
    }

    @Then("^the user has clicked start over button$")
    public void theUserHasSelectedStartOverButton() throws Throwable {
        this.borrowingPage.ClearFieldValues();
    }
}
