package Accessories;

import Shop.Stock;

public abstract class Accessory extends Stock {
    private String category;

    public Accessory(String description, double buyFor, double sellFor, String category) {
        super(description, buyFor, sellFor);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
