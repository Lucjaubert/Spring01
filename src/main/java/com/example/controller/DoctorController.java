package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/doctor1")
public String getDoctor1() {
return "William Hartnell";
}

@GetMapping("/doctor10")
public String getDoctor10() {
    return "David Tennant";
}

@GetMapping("/doctor13")
public String getDoctor13() {
    return "Jodie Whittaker";
}
}