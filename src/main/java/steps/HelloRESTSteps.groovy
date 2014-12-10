package steps

import appdriver.HelloRESTActions

import static cucumber.api.groovy.EN.And
import static cucumber.api.groovy.EN.Then
import static cucumber.api.groovy.EN.When

When(~'^I open "([^"]*)" endpoint$') { String endpoint ->
   HelloRESTActions.openClient(endpoint)
}
And(~'^I send "([^"]*)" request$') { String method ->
    HelloRESTActions.sendRequest(method)
}
Then(~'^I receive "([^"]*)" response status$') { String status ->
    HelloRESTActions.verifyResponse(status)
}