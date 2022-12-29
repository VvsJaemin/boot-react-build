package com.boot.react;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTestController {
    @GetMapping("/api/hello")
    public String test() {
        return "Hello, React!";
    }
}
