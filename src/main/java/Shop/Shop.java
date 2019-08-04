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

    public void removeItemFromStock(ISell item) {
        stock.remove(item);
    }

    public double canCalulateTotalAmountOfProfit() {
        double total = 0.00;
        for (ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }
}
