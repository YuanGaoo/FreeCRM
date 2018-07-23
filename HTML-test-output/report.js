$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/FreeCRM/Features/tagging.feature");
formatter.feature({
  "name": "Free CRM application testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FuntionalTest"
    }
  ]
});
formatter.scenario({
  "name": "Login with correct username and correct password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FuntionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "This is a valid login test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingDifitions.this_is_a_valid_login_test()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login with incorrect username and correct password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FuntionalTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "This is a invalid login test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingDifitions.this_is_a_invalid_login_test()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Create a deal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FuntionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "This is a deal test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingDifitions.this_is_a_deal_test_case()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Create a tasks",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FuntionalTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "This is a tasks test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingDifitions.this_is_a_tasks_test_case()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify left panel links",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FuntionalTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "This is a tasks test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingDifitions.this_is_a_tasks_test_case()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Search a deal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FuntionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "This is a search  deal test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingDifitions.this_is_a_search_deal_test()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Search a contact",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FuntionalTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "This is a search  contact test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingDifitions.this_is_a_search_contact_test()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Search a case",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FuntionalTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "This is a search  case test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingDifitions.this_is_a_search_case_test()"
});
formatter.result({
  "status": "skipped"
});
});