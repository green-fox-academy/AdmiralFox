package com.greenfoxacademy.todo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TodoController {

  @GetMapping("/todo")
  public String showTodo() {
    return "todo";
  }
  @GetMapping( value = {"/", "/list"})
  @ResponseBody
  public String list() {
    return "This is my first todo";
  }

}
