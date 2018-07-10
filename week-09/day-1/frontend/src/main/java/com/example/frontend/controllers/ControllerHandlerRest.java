package com.example.frontend.controllers;

import com.example.frontend.models.Doubling;
import com.example.frontend.models.ErrorHandling;
import com.example.frontend.models.AppendA;
import com.example.frontend.models.Messages;
import com.example.frontend.models.WelcomeMessage;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerHandlerRest {

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
  public Messages doUntil(@PathVariable(value = "what") int until) {
  return null;
  }
}
