package ReceptionistAtPetStore.Facade;
import ReceptionistAtPetStore.Pets.*;

public class Receptionist {
    private final Dog dog;
    private final Cat cat;

    public Receptionist(){
        //creates new objects
        dog = new Dog();
        cat = new Cat();
    }

    public void dogDoBath(String name) {
        // --- write your code here ---
        dog.bath(name);
    }

    public void catDoBath(String name) {
        // --- write your code here ---
        cat.bath(name);
    }
}
