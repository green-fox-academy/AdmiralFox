package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowBankAccount {

  @RequestMapping("/show")
  public String showRegistrationPage(Model model) {
    model.addAttribute("data", new BankAccount("Simba", 2000, "lion"));
    return "show";
  }

}
