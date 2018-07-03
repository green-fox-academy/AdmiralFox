package com.greenfoxacademy.connectionwithmysql.controller;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping("/todo")
  public String showTodo() {
    return "todo";
  }

  @GetMapping("/list")
  public String showTodoList(Model model) {
    model.addAttribute("newtodo",todoRepository.findAll());
    return "todolist";
  }
}
