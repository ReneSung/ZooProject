package ru.academy.zoo.objects;

import ru.academy.zoo.exceptions.AgeException;

public class Rabbit extends Animal{

  public Rabbit(String name_, int age_) throws AgeException {
    super(name_, age_);
  }

  @Override
  public void makeSound() {
    System.out.println("Пиии!");
  }
}
