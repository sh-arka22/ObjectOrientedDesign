package Factory;

import Fruits.Apple;
import Fruits.Banana;
import Interface.Fruit;

import java.util.Objects;

public class FruitFactory {
    public Fruit fruit = null;
    public Fruit packFruit(String name){

        if(Objects.equals(name, "Apple")){
            System.out.println("i am here");
            fruit = new Apple();
        }
        else if(Objects.equals(name, "Banana")){
            fruit = new Banana();
        }
        else{
            System.out.println("wrong fruit");
            return null;
        }
        return fruit;
    }
}
