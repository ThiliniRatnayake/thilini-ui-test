$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/au/com/anz/thilini/startoverbutton.feature");
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
formatter.after({
  "status": "passed"
});
});