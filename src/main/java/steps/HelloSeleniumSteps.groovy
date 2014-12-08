package steps

import appdriver.HelloSeleniumActions

import static cucumber.api.groovy.EN.And
import static cucumber.api.groovy.EN.Then
import static cucumber.api.groovy.EN.When

When(~'^I open "([^"]*)" home page$') { String url ->
    HelloSeleniumActions.open(url)
}
And(~'^I enter "([^"]*)" in the search box$') { String projectName ->
    HelloSeleniumActions.search(projectName)
}
And(~'^I click "([^"]*)" button$') { String buttonName ->
    HelloSeleniumActions.clickButton(buttonName)
}
Then(~'^I can see "([^"]*)" in the search result$') { String result ->
    HelloSeleniumActions.verifyResult(result)
}