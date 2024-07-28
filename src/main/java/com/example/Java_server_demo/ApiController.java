package com.example.Java_server_demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/endpoint1")
    public String endpoint1() {
        return "Endpoint 1: 200:OK";
    }

    @GetMapping("/endpoint2")
    public String endpoint2() {
        return "Endpoint 2: 200:OK";
    }

    @GetMapping("/endpoint3")
    public String endpoint3() {
        return "Endpoint 3: 200:OK";
    }

    @GetMapping("/endpoint4")
    public String endpoint4() {
        return "Endpoint 4: 404:Not Found";
    }

    @GetMapping("/endpoint5")
    public String endpoint5() {
        return "Server Error. Please connect again later.";
    }
}
