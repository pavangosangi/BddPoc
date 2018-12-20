Scenario: Two numbers should be added
  
Given valid numbers 5 and 5
When i add those two numbers
Then actual answer should be equal to what is expected

Scenario: Two numbers should be added but result should be failed
  
Given valid numbers 5 and 8
When i add those two numbers
Then actual answer should not be equal to what is expected