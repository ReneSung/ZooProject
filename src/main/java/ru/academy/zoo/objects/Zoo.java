package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.*;

import java.util.ArrayList;

public class Zoo {

  private static Zoo instance;

  private Zoo() {
    this.animals = new ArrayList<>();
  }

  public static Zoo getInstance() {
    if(instance == null) {
      instance = new Zoo();
    }
    return instance;
  }

  private static final Logger log = LogManager.getLogger(Zoo.class);

  private ArrayList<Animal> animals;

  public void showAllAnimals() {
    for (var i: animals) {
      System.out.println();
    }
  }


  public void zooWork() {

    try {
      Lion lion = new Lion("Лёва", 10);
      Eagle eagle = new Eagle("Кеша", 3);
      Dolphin dolphin = new Dolphin("Дмитрий", 5);
      Rabbit rabbit = new Rabbit("Валерий", 35);
      Penguin penguin = new Penguin("Вениамин", 10);
      Parrot parrot = new Parrot("Уолтер", 2);

      GroundEnclosure groundEnclosure = new GroundEnclosure(10);
      groundEnclosure.addAnimal(lion);
      groundEnclosure.addAnimal(rabbit);


      BirdEnclosure birdEnclosure = new BirdEnclosure(5);
      birdEnclosure.addAnimal(eagle);
      birdEnclosure.addAnimal(parrot);

      WaterEnclosure waterEnclosure = new WaterEnclosure(10);
      waterEnclosure.addAnimal(dolphin);
      waterEnclosure.addAnimal(penguin);

      for (Animal animal: this.animals) {
        animal.makeSound();
      }

      ServiceWorker serviceWorker = new ServiceWorker("Василий");
      serviceWorker.addEnclosure(waterEnclosure);
      serviceWorker.addEnclosure(groundEnclosure);
      serviceWorker.addEnclosure(birdEnclosure);

      serviceWorker.clearEnclosure(waterEnclosure);
      serviceWorker.clearEnclosure(groundEnclosure);
      serviceWorker.clearEnclosure(birdEnclosure);

      serviceWorker.feedAnimals(waterEnclosure);
      serviceWorker.feedAnimals(groundEnclosure);
      serviceWorker.feedAnimals(birdEnclosure);

      Vet vet = new Vet("Боб");
      vet.healAnimal(dolphin);
      vet.healAnimal(lion);


    } catch (AgeException | MaxCapacityException | AddTypeAnimalException | EnclosureOvercrowdingException |
             UnattendedEnclosureException e) {
      log.error("Ошибка", e);
    }
  }
}
