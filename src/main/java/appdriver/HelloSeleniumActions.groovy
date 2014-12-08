package appdriver

static void open(String url) {
    Browser.open(url)
}

static void search(String projectName) {
    Browser.typeText("q",projectName)
}

static void clickButton(String buttonName) {
    Browser.clickButton(buttonName)
}

static void verifyResult(String result) {
    assert Browser.findByCSS("em") == result
    Browser.close()
}


