package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vet extends Worker {

  private static final Logger log = LogManager.getLogger(Vet.class);

  public Vet(String name_) {
    super(name_);
  }

  public void healAnimal(Animal animal) {
    log.info("Лечение {}", animal.name);
  }
}
