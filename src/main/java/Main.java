import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import ru.academy.zoo.exceptions.AddTypeAnimalException;
import ru.academy.zoo.exceptions.AgeException;
import ru.academy.zoo.exceptions.EnclosureOvercrowdingException;
import ru.academy.zoo.exceptions.MaxCapacityException;
import ru.academy.zoo.objects.*;


import java.util.ArrayList;

public class Main {

  private static final Logger log = LogManager.getLogger(Main.class);

  public static void main(String[] args) {

    Zoo zoo = Zoo.getInstance();

    System.out.println(zoo.toString());

    /*Configurator.setRootLevel(Level.TRACE);

    try {
      Lion lion = new Lion("Лёва", 10);
      Eagle eagle = new Eagle("Кеша", 3);
      Dolphin dolphin = new Dolphin("Дмитрий", 5);
      Rabbit rabbit = new Rabbit("Валерий", 35);
      Penguin penguin = new Penguin("Вениамин", 10);
      Parrot parrot = new Parrot("Уолтер", 2);

      ArrayList<Animal> listAnimal = new ArrayList<Animal>();
      listAnimal.add(lion);
      listAnimal.add(eagle);
      listAnimal.add(dolphin);
      listAnimal.add(rabbit);
      listAnimal.add(penguin);
      listAnimal.add(parrot);

      for (Animal animal: listAnimal) {
        animal.makeSound();
      }

      GroundEnclosure groundEnclosure = new GroundEnclosure(10);
      groundEnclosure.addAnimal(lion);
      groundEnclosure.addAnimal(rabbit);

      BirdEnclosure birdEnclosure = new BirdEnclosure(5);
      birdEnclosure.addAnimal(eagle);
      birdEnclosure.addAnimal(parrot);

      WaterEnclosure waterEnclosure = new WaterEnclosure(10);
      waterEnclosure.addAnimal(dolphin);
      waterEnclosure.addAnimal(penguin);

    } catch (AgeException | MaxCapacityException | AddTypeAnimalException | EnclosureOvercrowdingException e) {
      log.error("Ошибка", e);
    }*/
  }
}