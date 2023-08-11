public class StockUnavailable implements Consumable {

    private int cooldown;

    StockUnavailable() {
        this.cooldown = 3;
    }

    @Override
    public void consume(VendingMachine machine) {
        // write your code here
        if(cooldown>0){
            System.out.println("consume failed: stock is empty, waiting for cooldown: "+cooldown);
            this.cooldown=cooldown-1;
        }else{
            machine.stock=3;
            machine.consume();
            this.cooldown=3;
        }
    }
}