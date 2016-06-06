package com.caminoramon.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GatewayController {

    @RequestMapping(name = "/hello", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<String> sayHello(@RequestParam(value = "name") String name){
        String returnValue = "Hello " + name;
        return new ResponseEntity<String>(returnValue, HttpStatus.OK);
    }
}
