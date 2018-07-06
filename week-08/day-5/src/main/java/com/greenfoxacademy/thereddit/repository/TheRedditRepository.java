package com.greenfoxacademy.thereddit.repository;

import com.greenfoxacademy.thereddit.models.TheReddit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TheRedditRepository extends CrudRepository<TheReddit, Long> {
}
