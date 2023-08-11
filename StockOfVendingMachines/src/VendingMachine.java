public class VendingMachine {

    int stock;
    Consumable available;
    Consumable unAvailable;
    VendingMachine() {
        // write your code here
        this.stock=3;
        this.available=new StockAvailable();
        this.unAvailable = new StockUnavailable();
    }

    public void consume() {
        // write your code here
        if(stock>0){
            stock--;
            available.consume(this);
        }
        else{
            unAvailable.consume(this);
        }
    }
}