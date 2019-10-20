package au.com.anz.thilini.basepage;

import au.com.anz.thilini.infrastructure.driver.Setup;
import au.com.anz.thilini.infrastructure.driver.TearDown;
import au.com.anz.thilini.infrastructure.driver.Wait;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;
    protected TearDown tearDown;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
        this.tearDown = new TearDown();
    }
}
