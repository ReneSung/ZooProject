package ru.academy.zoo.objects;

public class Zoo {

  private static Zoo instance;

  private Zoo() {}

  public static Zoo getInstance() {
    if(instance == null) {
      instance = new Zoo();
    }
    return instance;
  }

  public void PrintMessage(String message) {
    System.out.println(message);
  }
}
