package ru.academy.zoo.exceptions;

import java.text.MessageFormat;

public class UnattendedEnclosureException extends Exception {
  public UnattendedEnclosureException(String unattendedEnclosure) {
    super(MessageFormat.format("Сотрудник не обслуживает вольер {0}", unattendedEnclosure));
  }
}
