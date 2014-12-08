Feature: github home page
  In order to find this demo on github,
  As a github user,
  I want to be able to search this demo.

Scenario: github user can search this demo
  When I open "https://github.com/search?utf8=%E2%9C%93&q=&ref=simplesearch" home page
  And I enter "hello-auto-testing" in the search box
  And I click "button.button" button
  Then I can see "hello-auto-testing" in the search result