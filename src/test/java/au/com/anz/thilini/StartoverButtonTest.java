package au.com.anz.thilini;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by LakinduMac on 20/10/19.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/au/com/anz/thilini/startoverbutton.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/borrowing-page-clear-test.json",
        "html:target/borrowing-page-clear-test-html"},
        glue = {"au.com.anz.thilini.infrastructure.driver",
                "au.com.anz.thilini.borrowingpage"})
public class StartoverButtonTest {
}
