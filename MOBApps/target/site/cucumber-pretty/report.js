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
  "comments": [
    {
      "line": 8,
      "value": "#When I enter credentials \"\u003cusername\u003e\""
    }
  ],
  "line": 9,
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter credentials \"abcd\"",
  "keyword": "When "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "test-login;login-to-app-with-differnet-username-and-passowrd-using-scenario-outline;",
  "rows": [
    {
      "cells": [
        "username"
      ],
      "line": 12,
      "id": "test-login;login-to-app-with-differnet-username-and-passowrd-using-scenario-outline;;1"
    },
    {
      "cells": [
        "bspot@Cerebralfix.com"
      ],
      "line": 13,
      "id": "test-login;login-to-app-with-differnet-username-and-passowrd-using-scenario-outline;;2"
    },
    {
      "cells": [
        "bsoptt@Cerebralfix.com"
      ],
      "line": 14,
      "id": "test-login;login-to-app-with-differnet-username-and-passowrd-using-scenario-outline;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 32371985847,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
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
  "comments": [
    {
      "line": 8,
      "value": "#When I enter credentials \"\u003cusername\u003e\""
    }
  ],
  "line": 9,
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter credentials \"abcd\"",
  "keyword": "When "
});
formatter.match({
  "location": "SD.i_open_application_on_device()"
});
formatter.result({
  "duration": 2267423669,
  "status": "passed"
});
formatter.match({
  "location": "SD.i_click_on_login_button()"
});
formatter.result({
  "duration": 51994,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd",
      "offset": 21
    }
  ],
  "location": "SD.iEnterCredentials(String)"
});
formatter.result({
  "duration": 2501929,
  "status": "passed"
});
formatter.after({
  "duration": 535794394,
  "status": "passed"
});
formatter.before({
  "duration": 24313839537,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
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
  "comments": [
    {
      "line": 8,
      "value": "#When I enter credentials \"\u003cusername\u003e\""
    }
  ],
  "line": 9,
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter credentials \"abcd\"",
  "keyword": "When "
});
formatter.match({
  "location": "SD.i_open_application_on_device()"
});
formatter.result({
  "duration": 2065959348,
  "status": "passed"
});
formatter.match({
  "location": "SD.i_click_on_login_button()"
});
formatter.result({
  "duration": 37649,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd",
      "offset": 21
    }
  ],
  "location": "SD.iEnterCredentials(String)"
});
formatter.result({
  "duration": 108117,
  "status": "passed"
});
formatter.after({
  "duration": 568794272,
  "status": "passed"
});
});