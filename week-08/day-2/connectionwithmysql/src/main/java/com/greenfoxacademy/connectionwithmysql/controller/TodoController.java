package com.greenfoxacademy.connectionwithmysql.controller;
import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import com.greenfoxacademy.connectionwithmysql.services.TodoServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;
  @Autowired
  TodoServicesImpl todoServices;

  @GetMapping("/")
  public String showMainPage(){
    return "main";
  }

  @GetMapping("/todolist")
  public String listTodos(@RequestParam(name = "search", required = false) String search, Model model) {
    if(search != null) {
      model.addAttribute("todos", todoRepository.findAllByTitleContaining(search));
    }
    else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String showAdd(Model model){
    model.addAttribute("newTodo", new Todo());
    return "addnewtodo";
  }

  @PostMapping("/add")
  public String addToDo(@ModelAttribute Todo todo){
    todoRepository.save(todo);
    return "redirect:/todolist";
  }

  @PostMapping("/{id}/delete")
  public String deleteTodo(@PathVariable(value="id") long id ) {
    todoRepository.deleteById(id);
    return "redirect:/todolist";
  }

  @GetMapping("/{id}/edit")
  public String showEdit(@PathVariable(value="id") long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "edit";
  }

  @PostMapping("/edit")
  public String editTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todolist";
  }
}
