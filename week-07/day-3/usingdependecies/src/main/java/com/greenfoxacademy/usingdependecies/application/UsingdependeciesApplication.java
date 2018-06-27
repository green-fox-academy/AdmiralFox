package com.greenfoxacademy.usingdependecies.application;

import com.greenfoxacademy.usingdependecies.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.greenfoxacademy.usingdependecies")
public class UsingdependeciesApplication implements CommandLineRunner {
  @Autowired
  Printer printer;

  public static void main(String[] args) {
    SpringApplication.run(UsingdependeciesApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
      printer.log("Hello World");
  }
}
