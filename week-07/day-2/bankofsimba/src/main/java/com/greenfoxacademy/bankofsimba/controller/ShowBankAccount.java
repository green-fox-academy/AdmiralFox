package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowBankAccount {

  @RequestMapping("/show")
  public String showRegistrationPage(Model model) {
    model.addAttribute("data", new BankAccount("Simba", 2000.00, "lion"));
    return "show";
  }

  @RequestMapping("/texttest")
  public String showTextTest(Model model) {
    model.addAttribute("testText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "texttest";
  }
}
