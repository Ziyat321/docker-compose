package com.practice.subserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubServerController {
    @GetMapping("/sub")
    public String subEndpoint() {
        return "Message from SubServer";
    }
}
