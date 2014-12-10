package appdriver

import groovyx.net.http.RESTClient

class WebService {
    static RESTClient client
    static def response
    static String endpoint

    static def newClient() {
        client = new RESTClient(endpoint)
    }

    static def getResponse(String method) {
        switch (method) {
            case "GET":
                response = client.get(path: endpoint)
                break
            case "POST":
                //TODO: add parameters for post()
                response = client.post()
                break
            case "DELETE":
                //TODO: add parameters for delete()
                response = client.delete()
                break
        }
        response
    }

    static String getResponseStatus() {
        response.status
    }
}
