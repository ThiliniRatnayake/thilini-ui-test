$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/au/com/anz/thilini/borrowingestimate.feature");
formatter.feature({
  "name": "Borrowing page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check borrowing capacity",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user add all fields",
  "keyword": "Given "
});
formatter.match({
  "location": "BorrowingPageSteps.theUserSelectApplicationTypeSingle()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.cssSelector: span[class\u003d\u0027borrow__result__text\u0027] (tried for 10 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Lakindus-MBP.lan\u0027, ip: \u0027fe80:0:0:0:1890:3e00:ac2f:ee09%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_112\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.120, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: /var/folders/k6/d5t_7g_957q...}, goog:chromeOptions: {debuggerAddress: localhost:49698}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a595f2b986d4819bec08f3d899b1f49d\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat au.com.anz.thilini.infrastructure.driver.Wait.WaitForAnElementId(Wait.java:52)\n\tat au.com.anz.thilini.infrastructure.driver.Wait.waitForElementAttributeEqualsString(Wait.java:45)\n\tat au.com.anz.thilini.borrowingpage.BorrowingPage.addApplicationtypeSingle(BorrowingPage.java:89)\n\tat au.com.anz.thilini.borrowingpage.BorrowingPageSteps.theUserSelectApplicationTypeSingle(BorrowingPageSteps.java:24)\n\tat ✽.the user add all fields(file:src/test/resources/au/com/anz/thilini/borrowingestimate.feature:4)\n",
  "status": "failed"
});
formatter.step({
  "name": "calculate borrowing capacity",
  "keyword": "Then "
});
formatter.match({
  "location": "BorrowingPageSteps.test()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/au/com/anz/thilini/startoverbutton.feature");
formatter.feature({
  "name": "Selecting StartOver button",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Using start over button",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user has selected start over button",
  "keyword": "Given "
});
formatter.match({
  "location": "StartOverButtonSteps.theUserNavigatestoPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters field values",
  "keyword": "When "
});
formatter.match({
  "location": "StartOverButtonSteps.theUserEnterFieldValuesAndClickCalculate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user has clicked start over button",
  "keyword": "Then "
});
formatter.match({
  "location": "StartOverButtonSteps.theUserHasSelectedStartOverButton()"
});
formatter.result({
  "status": "passed"
});
});