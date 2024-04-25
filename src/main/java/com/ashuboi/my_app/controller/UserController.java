package com.ashuboi.my_app.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;w

import java.security.Principal;


@Controller
public class UserController {
    @RequestMapping(value = "/user")
    public String user(Model model, Principal principal) {

        UserDetails currentUser
                = (UserDetails) ((Authentication) principal).getPrincipal();
        model.addAttribute("username", currentUser.getUsername());
        return "user";
    }
}