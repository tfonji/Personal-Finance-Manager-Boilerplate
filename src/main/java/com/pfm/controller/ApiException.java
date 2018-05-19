package com.pfm.controller;

@javax.annotation.Generated(value = "com.pfm.codegen.languages.SpringCodegen", date = "2018-05-19T00:16:19.389Z")

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
