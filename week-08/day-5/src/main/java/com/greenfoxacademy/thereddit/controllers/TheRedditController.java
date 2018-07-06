package com.greenfoxacademy.thereddit.controllers;
import com.greenfoxacademy.thereddit.models.TheReddit;
import com.greenfoxacademy.thereddit.repository.TheRedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TheRedditController {

  @Autowired
  TheRedditRepository theRedditRepository;

  @GetMapping("")
  public String showIndexPage() {
    return "index";
  }

  @GetMapping("/submit")
  public String addPostRender(Model model){
    model.addAttribute("newpost", new TheReddit());
    return "submit";
  }

  @PostMapping("/submit")
  public String addPost(@ModelAttribute TheReddit todo){
    theRedditRepository.save(todo);
    return "redirect:/";
  }

}
