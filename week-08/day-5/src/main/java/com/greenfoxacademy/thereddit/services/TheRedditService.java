package com.greenfoxacademy.thereddit.services;

import com.greenfoxacademy.thereddit.models.TheReddit;
import com.greenfoxacademy.thereddit.repository.TheRedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheRedditService {

  @Autowired
  TheRedditRepository theRedditRepository;

  public void submitPost(TheReddit post) {
    theRedditRepository.save(post);
  }

  public TheReddit findPost(Long id) {
  return theRedditRepository.findById(id).get();
  }
  public List<TheReddit> findAll() {
    return theRedditRepository.findAll();
  }
}
