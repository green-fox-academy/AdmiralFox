package com.greenfoxacademy.programerfoxclub.controllers;

import com.greenfoxacademy.programerfoxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String redirectWithNewObject(@RequestParam(value = "username") String username) {
    foxService.login(username);
    return "redirect:/login/" + username;
  }

  @GetMapping("/login/{username}")
  public String showProfilPage(@PathVariable(value = "username") String username, Model model) {
    model.addAttribute("fox", foxService.getFox(username));
    return "index";
  }

  @PostMapping("/nutritionstore/{username}")
  public String redirectWithNewFood(@RequestParam(value = "Food") String username) {
    foxService.login(username);
    return "redirect:/nutritionstore/" + username;
  }

//  @GetMapping("/login/{username}")
//  public String showProfilPage(@PathVariable(value = "username") String username, Model model) {
//    model.addAttribute("fox", foxService.getFox(username));
//    return "index";
//  }
}
