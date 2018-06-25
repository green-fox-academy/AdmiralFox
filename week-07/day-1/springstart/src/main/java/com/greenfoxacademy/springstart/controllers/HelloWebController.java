package com.greenfoxacademy.springstart.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  private final AtomicLong counter = new AtomicLong();
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.incrementAndGet());
    model.addAttribute("hellos", iterateElements(hellos));
    model.addAttribute("rgb1", randomNumber());
    model.addAttribute("rgb2", randomNumber());
    model.addAttribute("rgb3", randomNumber());
    return "greeting";
  }

  public static String iterateElements(String[] elements) {
    String random = (elements[new Random().nextInt(elements.length)]);
    return random;
  }
  public static int randomNumber() {
    Integer random = new Random().nextInt(245);
    return random;
  }
}