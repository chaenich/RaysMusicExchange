package Accessories;

import Behaviours.ISell;

public class Drumstick implements ISell {
    private String description;
    private double buyFor;
    private double sellFor;

    public Drumstick(String description, double buyFor, double sellFor) {
        this.description = description;
        this.buyFor = buyFor;
        this.sellFor = sellFor;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyFor() {
        return buyFor;
    }

    public double getSellFor() {
        return sellFor;
    }

    public double calculateMarkup() {
        return sellFor - buyFor;
    }
}

