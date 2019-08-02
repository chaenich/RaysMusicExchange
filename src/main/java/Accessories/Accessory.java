package Accessories;

import Shop.Stock;

public abstract class Accessory extends Stock
{
    private String description;
    private double buyFor;
    private double sellFor;

    public Accessory(String description, double buyFor, double sellFor) {
        super(description, buyFor, sellFor);
    }
}
