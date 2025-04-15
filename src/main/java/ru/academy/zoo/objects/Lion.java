package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.AgeException;

public class Lion extends Animal implements IDangerous, IGroundAnimal {

  private static final Logger log = LogManager.getLogger(Lion.class);

  public Lion(String name_, int age_) throws AgeException {
    super(name_, age_);
  }

  @Override
  public void makeSound() {
    log.info("РРРРР");
  }

  // Максимальный уровень опасности по 10 бальной шкале
  @Override
  public int dangerLevel() {
    return 10;
  }

  @Override
  public boolean isBigAnimal() {
    return true;
  }
}
