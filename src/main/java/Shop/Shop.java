package Shop;

import java.util.ArrayList;

import Behaviours.ISell;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<ISell>();
    }

    public int getStockQty() {
        return stock.size();
    }

    public void addItemToStock(ISell item) {
        stock.add(item);
    }
}
