package ReceptionistAtPetStore.Pets;

import ReceptionistAtPetStore.Interface.Pet;

public class Dog implements Pet {

    // @Override
    public void bath(String name) {
        System.out.println("Dog: " + name + " -> Taking a bath.");
    }

}
