package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.AgeException;

public class Rabbit extends Animal implements IGroundAnimal{

  private static final Logger log = LogManager.getLogger(Lion.class);

  public Rabbit(String name_, int age_) throws AgeException {
    super(name_, age_);
  }

  @Override
  public void makeSound() {
    log.info("Пиии!");
  }

  @Override
  public boolean isBigAnimal() {
    return false;
  }
}
