package com.greenfoxacademy.programerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping("")
  public String showMainPage() {
    return "index";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(value = "username") String username) {
    userService.login(username);
    return "redirect:/profile/" + username;
  }
}
