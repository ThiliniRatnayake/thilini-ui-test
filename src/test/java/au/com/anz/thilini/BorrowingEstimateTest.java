package au.com.anz.thilini;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by LakinduMac on 16/10/19.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/au/com/anz/thilini/borrowingestimate.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports//borrowing-page-test.json",
        "html:target//borrowing-page-test-html"},
        glue = {"au.com.anz.thilini.infrastructure.driver",
                "au.com.anz.thilini.borrowingpage"})
public class BorrowingEstimateTest {
}
