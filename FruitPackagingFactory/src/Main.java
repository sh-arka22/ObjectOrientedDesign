import Factory.FruitFactory;
import Interface.Fruit;
public class Main {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        Fruit apple = factory.packFruit("Apple");
        if(apple != null) apple.pack();
    }
}