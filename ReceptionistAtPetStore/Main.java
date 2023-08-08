package ReceptionistAtPetStore;
import java.util.*;
import ReceptionistAtPetStore.Facade.Receptionist;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dog = scan.nextLine();
        String cat = scan.nextLine();
        // Recep
        Receptionist soumi = new Receptionist();
        Receptionist arka = new Receptionist();
        soumi.catDoBath(cat);
        soumi.dogDoBath(dog);
    }
}