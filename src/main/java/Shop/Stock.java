package Shop;

import Behaviours.ISell;
import Accessories.Accessory;
import Instruments.Instrument;


public abstract class Stock implements ISell {
    private String description;
    private double buyFor;
    private double sellFor;

    public Stock(String description, double buyFor, double sellFor) {
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
