Feature: REST service
  In order to get REST response,
  As a REST service user,
  I want to be able to send REST request.

  Scenario: REST service user send REST request
    When I open "https://www.google.com.au" endpoint
    And I send "GET" request
    Then I receive "200" response status