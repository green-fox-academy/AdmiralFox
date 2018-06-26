package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

  private String name;
  private double balance;
  private String showBalance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;


  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType, boolean isKing, boolean isGood) {
    this.name = name;
    this.balance = balance;
    showBalance= String.format("%.2f Zebra", balance);
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public boolean isGood() {
    return isGood;
  }

  public void setGood(boolean good) {
    isGood = good;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public String getShowBalance() {
    return showBalance;
  }

  public void setShowBalance(String showBalance) {
    this.showBalance = showBalance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

}
