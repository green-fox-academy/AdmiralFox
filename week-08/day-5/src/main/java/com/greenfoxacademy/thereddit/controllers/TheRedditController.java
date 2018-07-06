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

  @GetMapping("/{id}/incrementvote")
  public String incrmentVotePage(@PathVariable(value="id") long id, Model model) {
    model.addAttribute("incrementPostVote", theRedditService.incrementId(id));
    return "redirect:/";
  }

  @GetMapping("/{id}/decrementvote")
  public String decrementVotePage(@PathVariable(value="id") long id, Model model) {
    model.addAttribute("decrementPostVote", theRedditService.incrementId(id));
    return "redirect:/index";
  }
}
