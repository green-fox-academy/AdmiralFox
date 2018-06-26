package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

  String name;
  double balance;
  String showBalance;
  String animalType;

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    showBalance= String.format("%.2f Zebra", balance);
    this.animalType = animalType;
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
