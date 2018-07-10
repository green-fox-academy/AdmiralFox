package com.example.frontend.controllers;

import com.example.frontend.models.*;
import com.example.frontend.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerHandlerRest {

  @Autowired
  AppService appService;

  @GetMapping("/doubling")
  public Messages doublingNumber(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      Doubling doubling = new Doubling(input, input * 2);
      return doubling;
    }
    ErrorHandling error = new ErrorHandling();
    return error;
  }

  @GetMapping("/greeter")
  public Messages greeter(
          @RequestParam(value = "name", required = false) String name,
          @RequestParam(value = "title", required = false) String title) {
    if (name != null && title != null) {
      return (new WelcomeMessage(name, title));
    } else if (name == null) {
      return (new ErrorHandling("Please provide a name!"));
    }
    return (new ErrorHandling("Please provide a title!"));
  }

  @GetMapping("/appenda/{appendable}")
  public Messages appendA(@PathVariable(value = "appendable") String appendable) {
    AppendA appendA = new AppendA(appendable);
    return appendA;
  }

  @PostMapping("/dountil/{what}")
  public Object dountil(@PathVariable(value = "what", required = false) String what, @RequestBody(required = false) DoUntil dountil) {
    if (what.equals("sum")) {
      return (new Result(appService.sum(dountil.getUntil())));
    } else if (what.equals("factor")) {
      return (new Result(appService.factor(dountil.getUntil())));
    }
    return (new ErrorHandling("Please provide a number!"));
  }
}
