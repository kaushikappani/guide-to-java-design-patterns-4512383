package com.example;

import java.util.HashMap;

public class FlowerFactory {

  private static HashMap<String, Flower> flowerMap = new HashMap<>();

  public static Flower createFlower(String name) {
    return flowerMap.computeIfAbsent(name, Flower::new);
  }

}
