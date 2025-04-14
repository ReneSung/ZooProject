package ru.academy.zoo.objects;

import ru.academy.zoo.exceptions.AddTypeAnimalException;
import ru.academy.zoo.exceptions.MaxCapacityException;

import java.util.HashSet;
import java.util.Set;

// Общий класс вальера
public abstract class Enclosure {

  protected final int maxCapacity; // Максимальная вместимость

  protected final Set<Animal> animals;

  protected Enclosure(int maxCapacity_) throws MaxCapacityException {
    if (maxCapacity_ < 0 || maxCapacity_ > 500) {
      throw new MaxCapacityException(maxCapacity_);
    }
    this.maxCapacity = maxCapacity_;
    this.animals = new HashSet<Animal>();
  }

  public void addAnimal(Animal animal) throws AddTypeAnimalException {
    animals.add(animal);
  }
}
