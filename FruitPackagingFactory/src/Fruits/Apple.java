package Fruits;

import Interface.Fruit;

public class Apple implements Fruit {
    @Override
    public void pack() {
        System.out.println("Apple packed");
    }
}
