package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {
  private static final Map<String, Supplier<UserInterfaceFactory>> usserInterfaceFactory = new HashMap<>();
  static {
    usserInterfaceFactory.put("BLUE", BlueUserInterfaceFactory::new);
    usserInterfaceFactory.put("RED", RedUserInterfaceFactory::new);
  }

  public static UserInterfaceFactory getUserInterfaceFactory(String color) {
    return usserInterfaceFactory.get(color).get();
  }
}
