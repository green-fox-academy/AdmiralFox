package com.greenfoxacademy.thereddit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TheReddit {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String urlTitle;
  private String url;
  private int voteStatus;


  public TheReddit() {
  }

  public TheReddit(String urlTitle, String url) {
    this.urlTitle = urlTitle;
    this.url = url;
  }

  public TheReddit(String urlTitle, String url, int voteStatus) {
    this.urlTitle = urlTitle;
    this.url = url;
    this.voteStatus = voteStatus;
  }

  public int getVoteStatus() {
    return voteStatus;
  }

  public void setVoteStatus(int voteStatus) {
    this.voteStatus = voteStatus;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUrlTitle() {
    return urlTitle;
  }

  public void setUrlTitle(String urlTitle) {
    this.urlTitle = urlTitle;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
