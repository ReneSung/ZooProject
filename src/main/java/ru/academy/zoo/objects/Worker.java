package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashSet;
import java.util.Set;

public abstract class Worker {
  private static final Logger log = LogManager.getLogger(Worker.class);

  protected String name;

  protected Set<Enclosure> enclosures; // Список вальеров, которые обслуживает работник

  public Worker(String name_) {
    this.name = name_;
    this.enclosures = new HashSet<Enclosure>();
  }

  public String getName() {return this.name;}

  public void addEnclosure(Enclosure enclosure) {
    log.trace("Добавляем вальер в список обслуживаемых вальеров");
    this.enclosures.add(enclosure);
  }
}
