package ru.academy.zoo.objects;

import ru.academy.zoo.exceptions.AddTypeAnimalException;
import ru.academy.zoo.exceptions.EnclosureOvercrowdingException;
import ru.academy.zoo.exceptions.MaxCapacityException;

public class BirdEnclosure extends Enclosure{
  public BirdEnclosure(int maxCapacity_) throws MaxCapacityException {

    super(maxCapacity_);
  }

  @Override
  public void addAnimal(Animal animal) throws AddTypeAnimalException, EnclosureOvercrowdingException {

    if (animal instanceof IFlyable) {
      super.addAnimal(animal);
    } else {
      throw new AddTypeAnimalException(animal.getClass().getSimpleName());
    }
  }
}
