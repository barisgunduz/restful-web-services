package com.devstup.rest.webservices.restfulwebservices.helloWorld;

public class HelloWorldBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloWorldBean(String message) {
        this.message = message;
    }
}
