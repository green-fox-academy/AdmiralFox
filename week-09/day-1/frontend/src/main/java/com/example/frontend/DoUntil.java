package com.example.frontend;

public class DoUntil implements Messages {

  private int until;

  public DoUntil() {
    this.until = 15;
  }

  public DoUntil(int until) {
    this.until = until;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}
