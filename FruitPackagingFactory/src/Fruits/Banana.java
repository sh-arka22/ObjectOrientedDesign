package Fruits;

import Interface.Fruit;

public class Banana implements Fruit {
    @Override
    public void pack() {
        System.out.println("Banana packed");
    }
}
