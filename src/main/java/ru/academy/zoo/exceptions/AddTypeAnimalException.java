package ru.academy.zoo.exceptions;

import java.text.MessageFormat;

public class AddTypeAnimalException extends Throwable {
  public AddTypeAnimalException(String notCorrectClassAnimal) {
    super(MessageFormat.format("В вольер добавляется недопустимое животное с типом {0}", notCorrectClassAnimal));
  }
}
