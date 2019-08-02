package Accessories;

import Behaviours.ISell;

public class Drumstick extends Accessory {
    private String category;

    public Drumstick(String description, double buyFor, double sellFor, String category) {
        super(description, buyFor, sellFor);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}

