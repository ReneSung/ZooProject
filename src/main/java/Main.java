import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import ru.academy.zoo.exceptions.AddTypeAnimalException;
import ru.academy.zoo.exceptions.AgeException;
import ru.academy.zoo.exceptions.MaxCapacityException;
import ru.academy.zoo.objects.*;


import java.util.ArrayList;

public class Main {

  private static final Logger log = LogManager.getLogger(Main.class);

  public static void main(String[] args) {

    Configurator.setRootLevel(Level.TRACE);

    try {
      Lion lion = new Lion("Лёва", 10);
      Eagle eagle = new Eagle("Кеша", 3);
      Dolphin dolphin = new Dolphin("Дмитрий", 5);

      ArrayList<Animal> listAnimal = new ArrayList<Animal>();
      listAnimal.add(lion);
      listAnimal.add(eagle);
      listAnimal.add(dolphin);

      for (Animal animal: listAnimal) {
        animal.makeSound();
      }

      GroundEnclosure groundEnclosure = new GroundEnclosure(1);
      groundEnclosure.addAnimal(lion);

    } catch (AgeException | MaxCapacityException | AddTypeAnimalException e) {
      log.error("Ошибка", e);
    }
  }
}