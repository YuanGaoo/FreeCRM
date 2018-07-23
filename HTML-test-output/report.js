$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/FreeCRM/Features/DealsMap.feature");
formatter.feature({
  "name": "Deal data Map creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Free CRM create a new deal scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@temp"
    }
  ]
});
formatter.step({
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_is_already_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of login page is FREE CRM",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.title_of_login_page_is_FREE_CRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username username and password password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.user_enters_username_username_and_password_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user moves to new deals page",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.user_moves_to_new_deals_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probablity",
        "commission"
      ]
    },
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ]
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ]
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});