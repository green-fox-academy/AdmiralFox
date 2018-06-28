package com.greenfoxacademy.programerfoxclub.models;
import java.util.ArrayList;


public class Fox {

  private String name;
  private ArrayList<String> foods;
  private ArrayList<String> drinks;
  private ArrayList<String> tricks;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
    this.foods = new ArrayList <>();
    this.drinks = new ArrayList <>();
    this.tricks = new ArrayList <>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList <String> getFoods() {
    return foods;
  }

  public void setFoods(ArrayList <String> foods) {
    this.foods = foods;
  }

  public ArrayList <String> getDrinks() {
    return drinks;
  }

  public void setDrinks(ArrayList <String> drinks) {
    this.drinks = drinks;
  }

  public ArrayList <String> getTricks() {
    return tricks;
  }

  public void setTricks(ArrayList <String> tricks) {
    this.tricks = tricks;
  }
}
