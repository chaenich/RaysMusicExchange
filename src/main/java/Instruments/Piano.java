package Instruments;

import Behaviours.ISell;

public class Piano extends Instrument implements ISell {
    private int numKeys;

    public Piano(String description, double buyFor, double sellFor,
                 String type, String colour, String material, int numKeys) {
        super(description, buyFor, sellFor, type, colour, material);
        this.numKeys = numKeys;
    }

    public int getNumKeys() {
        return numKeys;
    }

    public String play() {
        return "Plink Plink";
    }
}
