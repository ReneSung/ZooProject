package ru.academy.zoo.objects;

import ru.academy.zoo.exceptions.AddTypeAnimalException;
import ru.academy.zoo.exceptions.EnclosureOvercrowdingException;
import ru.academy.zoo.exceptions.MaxCapacityException;

public class WaterEnclosure extends Enclosure{

  public WaterEnclosure(int maxCapacity_) throws MaxCapacityException {
    super(maxCapacity_);
  }

  @Override
  public void addAnimal(Animal animal) throws AddTypeAnimalException, EnclosureOvercrowdingException {

    if (animal instanceof ISwimmable) {
      super.addAnimal(animal);
    } else {
      throw new AddTypeAnimalException(animal.getClass().getSimpleName());
    }
  }
}
