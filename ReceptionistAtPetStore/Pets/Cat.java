package ReceptionistAtPetStore.Pets;
import ReceptionistAtPetStore.Interface.Pet;

public class Cat implements Pet {

    // @Override
    public void bath(String name) {
        System.out.println("Cat: " + name + " -> Taking a bath.");
    }

}
