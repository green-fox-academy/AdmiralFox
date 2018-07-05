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

  @GetMapping("/todolist")
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model,
                     @RequestParam(value = "search", required = false) String search) {
    if (isActive) {
      model.addAttribute("todos", todoRepository.findAllByDone(false));
    }
    if(search != null) {
      model.addAttribute("todos", todoRepository.findAllByTitleContaining(search));
    }
    else {
      model.addAttribute("todos", todoRepository.findAll());
    }
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
  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable(value="id") long id ) {
    todoRepository.deleteById(id);
    return "redirect:/todolist";
  }

  @RequestMapping(value="/{id}/edit", method=RequestMethod.GET)
  public String editTodoPage(@PathVariable(value="id") long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "edit";
  }

  @RequestMapping(value="/{id}/edit", method=RequestMethod.POST)
  public String editTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todolist";
  }
}
