$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Chekc.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login",
  "description": "\nTest user login condition",
  "id": "test-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Login to app with differnet username and passowrd using scenario outline",
  "description": "",
  "id": "test-login;login-to-app-with-differnet-username-and-passowrd-using-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open application on device",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter credentials \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "test-login;login-to-app-with-differnet-username-and-passowrd-using-scenario-outline;",
  "rows": [
    {
      "cells": [
        "username"
      ],
      "line": 11,
      "id": "test-login;login-to-app-with-differnet-username-and-passowrd-using-scenario-outline;;1"
    },
    {
      "cells": [
        "ValidUser"
      ],
      "line": 12,
      "id": "test-login;login-to-app-with-differnet-username-and-passowrd-using-scenario-outline;;2"
    },
    {
      "cells": [
        "InvalidUser"
      ],
      "line": 13,
      "id": "test-login;login-to-app-with-differnet-username-and-passowrd-using-scenario-outline;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 31313217105,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login to app with differnet username and passowrd using scenario outline",
  "description": "",
  "id": "test-login;login-to-app-with-differnet-username-and-passowrd-using-scenario-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open application on device",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter credentials \"ValidUser\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "SD.i_open_application_on_device()"
});
formatter.result({
  "duration": 278063592,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ValidUser",
      "offset": 21
    }
  ],
  "location": "SD.iEnterCredentials(String)"
});
formatter.result({
  "duration": 2886527,
  "status": "passed"
});
formatter.match({
  "location": "SD.i_click_on_login_button()"
});
formatter.result({
  "duration": 86562,
  "status": "passed"
});
formatter.after({
  "duration": 587931282,
  "status": "passed"
});
formatter.before({
  "duration": 28469994031,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login to app with differnet username and passowrd using scenario outline",
  "description": "",
  "id": "test-login;login-to-app-with-differnet-username-and-passowrd-using-scenario-outline;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open application on device",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter credentials \"InvalidUser\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "SD.i_open_application_on_device()"
});
formatter.result({
  "duration": 240772,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "InvalidUser",
      "offset": 21
    }
  ],
  "location": "SD.iEnterCredentials(String)"
});
formatter.result({
  "duration": 132920,
  "status": "passed"
});
formatter.match({
  "location": "SD.i_click_on_login_button()"
});
formatter.result({
  "duration": 59844,
  "status": "passed"
});
formatter.after({
  "duration": 552859394,
  "status": "passed"
});
});