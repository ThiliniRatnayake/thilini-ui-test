package au.com.anz.thilini.borrowingpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by LakinduMac on 19/10/19.
 */
public class BorrowingPageSteps {

    private BorrowingPage borrowingPage;

    public BorrowingPageSteps() {
        this.borrowingPage = new BorrowingPage();
    }

    @Then("^calculate borrowing capacity$")
    public void test() throws Throwable {
    }

    @Given("^the user add all fields$")
    public void theUserSelectApplicationTypeSingle() throws Throwable {
        borrowingPage.goToBorrowingPage();
        borrowingPage.addApplicationtypeSingle();
    }


}
