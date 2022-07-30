$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "To validate the login functionality of the Zappos page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sachin"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch chrome and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_launch_chrome_and_load_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate login functionality with valid email and invalid PASSWORD",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sachin"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User should click the sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_click_the_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the sign in with zappos button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_click_the_sign_in_with_zappos_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should pass the valid email and invalid PASSWORD",
  "rows": [
    {
      "cells": [
        "java",
        "java@123",
        "sql",
        "sql@34",
        "selenium",
        "selenium@123"
      ]
    },
    {
      "cells": [
        "pen",
        "pen@123",
        "pencil",
        "pencil@34",
        "note",
        "note@123"
      ]
    },
    {
      "cells": [
        "deva",
        "deva@123",
        "gayu",
        "gayu@34",
        "sowmi",
        "sowmi@123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_pass_the_valid_email_and_invalid_PASSWORD(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should print the TITLE of ur page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_print_the_TITLE_of_ur_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});