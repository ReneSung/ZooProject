package ru.academy.zoo.exceptions;

public class AgeException extends Exception {
  public AgeException(int age) {

    super("Некорректные возраст " + age);
  }
}