package Instruments;

import Behaviours.ISell;

public class Flute extends Instrument implements ISell {
    private int numValves;
    private String description;
    private double buyFor;
    private double sellFor;

    public Flute(String type, String colour, String material, int numValves,
                 String description, double buyFor, double sellFor) {
        super(type, colour, material);
        this.numValves = numValves;
        this.description = description;
        this.buyFor = buyFor;
        this.sellFor = sellFor;
    }

    public int getNumValves() {
        return numValves;
    }

    public String play() {
        return "Peep Peep";
    }

    public double calculateMarkup() {
        return sellFor - buyFor;
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
}
