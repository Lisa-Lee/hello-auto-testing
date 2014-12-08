package runnable

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/HelloSelenium.feature",
        glue = "classpath:steps")
class HelloSeleniumTests {
}


