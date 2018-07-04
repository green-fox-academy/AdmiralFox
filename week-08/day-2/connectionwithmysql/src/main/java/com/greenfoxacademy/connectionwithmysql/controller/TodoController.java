package com.greenfoxacademy.connectionwithmysql.controller;
import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import com.greenfoxacademy.connectionwithmysql.services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;
  @Autowired
  TodoServices todoServices;

  @GetMapping("/todo")
  public String todo(){
    return "todo";
  }

  @GetMapping(value = {"/todolist"})
  public String list(Model model, @RequestParam(name = "isActive", required = false) String isActive){
    model.addAttribute("istrue", isActive);
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
  @GetMapping("/add")
  public String addToDoRender(Model model){
    model.addAttribute("newTodo", new Todo());
    return "addnewtodo";
  }

  @PostMapping("/add")
  public String addToDo(@ModelAttribute Todo todo){
    todoRepository.save(todo);
    return "redirect:/todolist";
  }
  @RequestMapping(value="/{id}/delete", method=RequestMethod.GET)
  public String deleteTodo(@PathVariable(value="id") long id ) {
    todoRepository.deleteById(id);
    return "redirect:/todolist";
  }

  @PostMapping("/delete")
  public String deleteToDo(@ModelAttribute Todo todo){
    todoServices.addTodo(todo);
    return "redirect:/todolist";
  }
}
