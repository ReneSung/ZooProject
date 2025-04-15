package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.AgeException;

public class Parrot extends Animal implements IFlyable {

  private static final Logger log = LogManager.getLogger(Parrot.class);

  public Parrot(String name_, int age_) throws AgeException {
    super(name_, age_);
  }

  @Override
  public void makeSound() {
    log.info("ЧИРИК!");
  }

  @Override
  public boolean isBigBird() {
    return false;
  }

  @Override
  public void fly() {
    log.info("Попугай {} летит", getName());
  }
}
