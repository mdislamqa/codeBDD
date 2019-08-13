$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/ripam/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#WITHOUT USING EXAMPLES KEYWORD"
    },
    {
      "line": 4,
      "value": "#"
    }
  ],
  "line": 5,
  "name": "Free Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enter \"naveenk\" and \"test@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User is on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_already_on_login_page()"
});
formatter.result({
  "duration": 6609654719,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 15253871,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 12
    },
    {
      "val": "test@123",
      "offset": 26
    }
  ],
  "location": "LoginStepDefinition.User_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 255820135,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.User_click_on_submit_button()"
});
formatter.result({
  "duration": 2769115345,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_Home_page()"
});
formatter.result({
  "duration": 142527060,
  "status": "passed"
});
});