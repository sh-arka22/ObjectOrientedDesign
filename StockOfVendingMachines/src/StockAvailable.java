public class StockAvailable implements Consumable {

    @Override
    public void consume(VendingMachine machine) {
        // write your code here
        System.out.println("consume succeed: "+machine.stock+" remaining");
    }
}