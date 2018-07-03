package com.greenfoxacademy.connectionwithmysql.services;


import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServices {

  @Autowired
  private TodoRepository todoRepository;

  public List<Todo> getAllTopics() {
    return todoRepository.findAll();
  }

  public Optional<Todo> getTodo(Long id) {
    return todoRepository.findById(id);
  }

  public  void addTodo(Todo todo) {
    todoRepository.save(todo);
  }

  public void updateTodo(Long id, Todo todo) {
    todoRepository.save(todo);

  }
  public void deleteTodo(Long id) {
    todoRepository.deleteById(id);
  }
}
