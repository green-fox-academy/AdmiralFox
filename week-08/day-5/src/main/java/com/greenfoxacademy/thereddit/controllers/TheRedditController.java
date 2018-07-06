package com.greenfoxacademy.thereddit.controllers;
import com.greenfoxacademy.thereddit.models.TheReddit;
import com.greenfoxacademy.thereddit.repository.TheRedditRepository;
import com.greenfoxacademy.thereddit.services.TheRedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TheRedditController {


  @Autowired
  TheRedditService theRedditService;



  @GetMapping("")
  public String showIndexPage(Model model) {
    model.addAttribute("posts", theRedditService.findAll());
    return "index";
  }


  @GetMapping("/submit")
  public String addPostRender(Model model){
    model.addAttribute("newpost", new TheReddit());
    return "submit";
  }

  @PostMapping("/submit")
  public String addPost(@ModelAttribute TheReddit post){
    theRedditService.submitPost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/editvote")
  public String editVotePage(@PathVariable(value="id") long id, Model model) {
    model.addAttribute("todo", theRedditService.findPost(id));
    return "index";
  }

  @PostMapping("/{id}/editvote")
  public String editVote(@ModelAttribute TheReddit post) {
    theRedditService.submitPost(post);
    return "redirect:/index";
  }

}
