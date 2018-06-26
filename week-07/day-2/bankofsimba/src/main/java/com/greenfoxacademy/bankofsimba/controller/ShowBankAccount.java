package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowBankAccount {

  private List<BankAccount> bankAccounts;

  public ShowBankAccount() {
    bankAccounts = new ArrayList <>();
  }


  @RequestMapping("/show")
  public String showRegistrationPage(Model model) {
    model.addAttribute("data", new BankAccount("Simba", 2000.00, "lion", false, false));
    return "show";
  }

  @RequestMapping("/texttest")
  public String showTextTest(Model model) {
    model.addAttribute("testText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "texttest";
  }
  @RequestMapping("/listaccounts")
  public String listAccounts(Model model) {
    model.addAttribute("newBankAccount", bankAccounts);
    bankAccounts.add(new BankAccount("Zordon",4000.00, "lion", false, true));
    bankAccounts.add(new BankAccount("Mufasa", 5000.00, "lion", true, true));
    bankAccounts.add(new BankAccount("Timon", 1000.00, "suricata", false ,false));
    bankAccounts.add(new BankAccount("Zazu",150.00, "tucan", false, true));
    bankAccounts.add(new BankAccount("Balu", 50000.00, "bear", false, false));
    return "listaccounts";
  }
}
