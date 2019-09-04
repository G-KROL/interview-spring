package com.company.interview;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class AppVersionController {

    private static String VERSION = "1.0.0";

    @GetMapping
    public ResponseEntity<String> getVersion() {
        return new ResponseEntity<>(VERSION, HttpStatus.OK);
    }
}
