package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.AddTypeAnimalException;
import ru.academy.zoo.exceptions.EnclosureOvercrowdingException;
import ru.academy.zoo.exceptions.MaxCapacityException;

import java.util.HashSet;
import java.util.Set;

// Общий класс вальера
public abstract class Enclosure {

  private static final Logger log = LogManager.getLogger(Enclosure.class);

  protected final int maxCapacity; // Максимальная вместимость

  protected final Set<Animal> animals;

  protected Enclosure(int maxCapacity_) throws MaxCapacityException {
    if (maxCapacity_ < 0 || maxCapacity_ > 500) {
      throw new MaxCapacityException(maxCapacity_);
    }
    this.maxCapacity = maxCapacity_;
    this.animals = new HashSet<Animal>();
  }

  public void addAnimal(Animal animal) throws AddTypeAnimalException, EnclosureOvercrowdingException {

    log.debug("Проверяем количество животных в вольере");
    if (animals.size() == this.maxCapacity)
      throw new EnclosureOvercrowdingException(this.maxCapacity);

    log.trace("добавляем {} в вольер", animal.getClass().getSimpleName());
    animals.add(animal);
  }
}
