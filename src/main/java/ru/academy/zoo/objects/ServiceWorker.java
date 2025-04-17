package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.UnattendedEnclosureException;

public class ServiceWorker extends Worker{
  private static final Logger log = LogManager.getLogger(ServiceWorker.class);

  public ServiceWorker(String name_) {
    super(name_);
  }

  public void feedAnimals(Enclosure enclosure) throws UnattendedEnclosureException {
    checkServicedEnclosure(enclosure);

    log.info("Животные в вольере {} накормлены", enclosure.getClass().getSimpleName());
  }

  public void clearEnclosure(Enclosure enclosure) throws UnattendedEnclosureException {
    checkServicedEnclosure(enclosure);

    log.info("Вальер {} убран", enclosure.getClass().getSimpleName());
  }

  public void checkServicedEnclosure(Enclosure enclosure) throws UnattendedEnclosureException {
    if (!enclosures.contains(enclosure)) {
      log.debug("Проверяем список обслуживаемых вальеров");

      throw new UnattendedEnclosureException(enclosure.getClass().getSimpleName());
    }
  }
}
