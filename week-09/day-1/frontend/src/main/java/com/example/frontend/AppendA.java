package com.example.frontend;

public class AppendA implements Messages{
  private String appended;

  public AppendA() {
  }

  public AppendA(String appended) {
    this.appended = appended + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
