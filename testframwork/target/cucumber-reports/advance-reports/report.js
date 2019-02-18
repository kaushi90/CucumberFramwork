$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/contactus.feature");
formatter.feature({
  "line": 2,
  "name": "validate contact us scenario",
  "description": "",
  "id": "validate-contact-us-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ContactUsTest"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Send message to company",
  "description": "",
  "id": "validate-contact-us-scenario;send-message-to-company",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "open chrome browser and enter URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "set subject dropdown ,email,orderRef",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "upload file",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click send button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "display successfully send message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});