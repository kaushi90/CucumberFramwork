@ContactUsTest
  Feature:validate contact us scenario
    Scenario:Send message to company
    Given open chrome browser and enter URL
    When set subject dropdown ,email,orderRef
      And upload file
      When click send button
      Then display successfully send message
