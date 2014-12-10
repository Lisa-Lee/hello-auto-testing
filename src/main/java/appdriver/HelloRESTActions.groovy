package appdriver

static def openClient(String endpoint) {
    WebService.endpoint = endpoint
    WebService.newClient()
}

static def sendRequest(String method) {
    WebService.getResponse(method)
}

static void verifyResponse(String status) {
    assert status == WebService.responseStatus
}