package com.example.booking.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotels {
    @GetMapping("/hotels")
    public String getData() {return "Please book hotels ticket on booking.com with 20% discount"; }
}
