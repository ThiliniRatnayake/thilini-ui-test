package au.com.anz.thilini;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/au/com/anz/thilini/startoverbutton.feature", "src/test/resources/au/com/anz/thilini/borrowingestimate.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/test-results.json",
        "html:target/test-results-html"})

public class TestSuite {
}