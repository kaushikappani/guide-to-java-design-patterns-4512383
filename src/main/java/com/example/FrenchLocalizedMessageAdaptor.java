package com.example;

public class FrenchLocalizedMessageAdaptor extends FrenchLocalizedMessage
    implements LocalizedMessage {

  @Override
  public void sayHello() {
    sayBonjour();
  }

}
