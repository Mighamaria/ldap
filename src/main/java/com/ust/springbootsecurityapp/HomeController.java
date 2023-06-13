package com.ust.springbootsecurityapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

   @GetMapping("/home")
    public String index() {
        return "You have successfully logged in spring security  LDAP authentication!";
    }

}
