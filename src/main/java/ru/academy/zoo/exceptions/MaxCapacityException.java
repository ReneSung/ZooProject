package ru.academy.zoo.exceptions;

public class MaxCapacityException extends Exception {

  public MaxCapacityException(int maxCapacity) {
    super("Некорректное значение максимального оъема вальера" + maxCapacity);
  }
}
