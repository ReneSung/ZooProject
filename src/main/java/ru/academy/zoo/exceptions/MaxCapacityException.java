package ru.academy.zoo.exceptions;

public class MaxCapacityException extends Exception {

  public MaxCapacityException(int maxCapacity) {
    super("Некорректное значение максимальношо оъема вальера" + maxCapacity);
  }
}
