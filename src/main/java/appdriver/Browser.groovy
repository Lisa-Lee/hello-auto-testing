package appdriver

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.firefox.FirefoxDriver

class Browser {
    static WebDriver driver
    static WebElement element

    static void open(String url) {
        //Run testing backend
        //driver = new HtmlUnitDriver();
        //Run testing on Firefox
        driver = new FirefoxDriver()
        driver.get(url)
    }

    static void typeText(key, value) {
        element = findByName(key)
        element.sendKeys(value)
    }

    static WebElement findByName(String key) {
        driver.findElement(By.name(key))
    }

    static String findByCSS(String key) {
        driver.findElement(By.cssSelector(key)).text
    }

    static void clickButton(String key) {
        driver.findElement(By.cssSelector(key)).click()
    }

    static void close() {
        driver.close()
    }
}
