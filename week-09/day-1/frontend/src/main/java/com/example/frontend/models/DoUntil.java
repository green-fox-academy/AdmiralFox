package com.example.frontend.models;

public class DoUntil implements Messages {

  private int until;

  public DoUntil() {
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

  private static int numberAdder(int limit) {
    if (limit == 1) {
      return 1;
    } else {
      return limit + numberAdder(limit - 1);
    }
  }

  private static int refactorio(int n) {
    if (n == 0){
      return 1;
    }
    return n * refactorio(n - 1);
  }
}
