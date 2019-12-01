import Behaviour.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public void addToStock(ISell item){
        this.stock.add(item);
    }

    public void removeFromStock(ISell item){
        this.stock.remove(item);
    }

    public int stockCount(){
        return this.stock.size();
    }
}
