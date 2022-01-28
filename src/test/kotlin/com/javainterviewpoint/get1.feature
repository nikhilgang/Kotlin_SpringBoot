Feature: A simple Karate test
Scenario: Testing valid GET endpoint
Given url 'http://localhost:8095/employee/7'
When method GET
Then status 200