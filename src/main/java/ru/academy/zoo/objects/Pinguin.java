package ru.academy.zoo.objects;

import ru.academy.zoo.exceptions.AgeException;

public class Pinguin extends Animal{
  public Pinguin(String name_, int age_) throws AgeException {
    super(name_, age_);
  }

  @Override
  public void makeSound() {
    System.out.println("КРя");
  }
}
