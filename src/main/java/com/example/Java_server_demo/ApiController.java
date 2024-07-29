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
    public ResponseEntity<String> endpoint1() {
        return ResponseEntity.ok("Success 200: OK Endpoint 1");
    }

    @GetMapping("/endpoint2")
    public ResponseEntity<String> endpoint2() {
        return ResponseEntity.ok("Success 200: OK Endpoint 2");
    }

    @GetMapping("/endpoint3")
    public ResponseEntity<String> endpoint3() {
        return ResponseEntity.ok("Success 200: OK Endpoint 3");
    }

    @GetMapping("/endpoint4")
    public ResponseEntity<String> endpoint4() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
    }

    @GetMapping("/endpoint5")
    public ResponseEntity<String> endpoint5() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Server Error");
    }
}

