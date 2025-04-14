package ru.academy.zoo.objects;

import ru.academy.zoo.exceptions.AddTypeAnimalException;
import ru.academy.zoo.exceptions.MaxCapacityException;

import java.util.Set;

// Вальер для наземных животных
public class GroundEnclosure extends Enclosure{
  public GroundEnclosure(int maxCapacity_) throws MaxCapacityException {

    super(maxCapacity_);
  }

  @Override
  public void addAnimal(Animal animal) throws AddTypeAnimalException {

    if (animal instanceof IGroundAnimal) {
      super.addAnimal(animal);
    } else {
      throw new AddTypeAnimalException(animal.getClass().getSimpleName());
    }
  }
}
