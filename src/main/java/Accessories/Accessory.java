package Accessories;

public abstract class Accessory {
    private String description;
    private double buyFor;
    private double sellFor;

    public Accessory(String description, double buyFor, double sellFor) {
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
