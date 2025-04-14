package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.AgeException;



public class Eagle extends Animal implements IFlyable {

  private static final Logger log = LogManager.getLogger(Eagle.class);

  public Eagle(String name_, int age_) throws AgeException {
    super(name_, age_);
  }

  @Override
  public void makeSound() {
    log.info("Карр!!");
  }

  @Override
  public boolean isBigBird() {
    return true;
  }

  @Override
  public void fly() {
    log.info("Орел с именем " + getName() + " летит");
  }
}
