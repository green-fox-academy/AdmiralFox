package com.example.frontend.models;

import com.example.frontend.models.Messages;

public class ErrorHandling implements Messages {

  private String error = "Please provide an input!";

  public ErrorHandling() {
  }

  public ErrorHandling(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
