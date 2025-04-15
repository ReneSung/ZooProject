package ru.academy.zoo.exceptions;

public class EnclosureOvercrowdingException extends Exception {
  public EnclosureOvercrowdingException(int maxAnimals) {
    super("Превышено максимальное количество животных в вольере " + maxAnimals);
  }
}
