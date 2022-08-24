$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/scenariooutline.feature");
formatter.feature({
  "name": "Facebool login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open Fb and launch the application",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter user name as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "laura",
        "lxxx"
      ]
    },
    {
      "cells": [
        "raj",
        "rxxx"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "open Fb and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginpagestepdefsenariooutline.open_Fb_and_launch_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter user name as \"laura\" and password as \"lxxx\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginpagestepdefsenariooutline.enter_user_name_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpagestepdefsenariooutline.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "open Fb and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginpagestepdefsenariooutline.open_Fb_and_launch_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter user name as \"raj\" and password as \"rxxx\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginpagestepdefsenariooutline.enter_user_name_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpagestepdefsenariooutline.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});