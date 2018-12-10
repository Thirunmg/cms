package com.thiru.cms.exception;




public class CustomerNotFoundException extends RuntimeException {

    public  CustomerNotFoundException(String message){
        super(message);
    }
}
