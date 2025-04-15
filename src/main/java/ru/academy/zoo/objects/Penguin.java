package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.AgeException;

public class Penguin extends Animal implements ISwimmable{

  private static final Logger log = LogManager.getLogger(Penguin.class);

  public Penguin(String name_, int age_) throws AgeException {
    super(name_, age_);
  }

  @Override
  public void makeSound() {
    log.info("КРя");
  }

  @Override
  public boolean isSaltWater() {
    return false;
  }
}
