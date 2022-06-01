package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestController
public class TestController {


    @GetMapping(path = "/smoke")
    public ResponseEntity<String> smokeTest() {
        try {
            return ResponseEntity.ok("External Service called - Mono implementation done ");
        } catch (Exception e) {
            return ResponseEntity.status(INTERNAL_SERVER_ERROR).build();
        }
    }
}
