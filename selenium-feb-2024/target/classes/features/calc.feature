Feature: caluculator file

  Background: test background
    Given i am a caluculator

  Scenario: check addition of two numbers
    Given two integer numbers 10 and 20
    When i added both numbers
    Then i verify result is 30
    
  Scenario Outline:  check addition of two numbers with multiple set of data
    Given two integer numbers <data1> and <data2>
    When i added both numbers
    Then i verify result is <result>
    
  Examples: test data
     | data1 | data2 | result |
     |   10  |  20   |   30   |
     |   15  |  25   |   40   |
     |   13  |  22   |   35   |
     |   20  |  30   |   50   |
     |   60  |  20   |   80   |
     