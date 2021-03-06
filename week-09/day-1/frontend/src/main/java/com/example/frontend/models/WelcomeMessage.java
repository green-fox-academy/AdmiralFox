package com.example.frontend.models;

import com.example.frontend.models.Messages;

public class WelcomeMessage implements Messages {

  private String welcome_message;

  public WelcomeMessage() {
  }

  public WelcomeMessage(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }


  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}

