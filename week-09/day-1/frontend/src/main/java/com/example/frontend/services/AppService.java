package com.example.frontend.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AppService {

  public int sum(int number) {
    int sum = 0;
    for (int i = 0; i <= number; i++) {
      sum = sum + i;
    }
    return sum;
  }

  public int factor(int number) {
    int sum = 1;
    for (int i = 1; i <= number; i++) {
      sum = sum * i;
    }
    return sum;
  }


  public ArrayList <Integer> doubleNumbers(ArrayList <Integer> numbers) {
    ArrayList <Integer> result = new ArrayList <>();

    for (Integer number : numbers) {
      result.add(number * 2);
    }
    return result;
  }

  public int multiplyNumbers(ArrayList <Integer> numbers) {
    int sum = 1;

    for (Integer number : numbers) {
      sum = sum * number;
    }
    return sum;
  }

  public int sumNumbers(ArrayList <Integer> numbers) {
    int sum = 0;

    for (Integer number : numbers) {
      sum = sum + number;
    }
    return sum;
  }

}