package com.example.frontend.models;

public class Result implements Messages {

  private int result;

  public Result() {
  }

  public Result(int result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
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