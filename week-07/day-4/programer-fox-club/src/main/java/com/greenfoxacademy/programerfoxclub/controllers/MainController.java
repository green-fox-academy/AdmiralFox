package com.greenfoxacademy.programerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @GetMapping("")
  public String showMainPage(@RequestParam(value = "name", required = false) String userInput, Model model) {
    model.addAttribute("name", userInput);
    return "index";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

//  @GetMapping("login/{name}")
//  public String renderProfilePage(@PathVariable(value = "name") String name, Model model) {
//    return "";
//  }
}
