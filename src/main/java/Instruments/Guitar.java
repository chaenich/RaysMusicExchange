package Instruments;

import Behaviours.ISell;

public class Guitar extends Instrument implements ISell {
    private int numStrings;

    public Guitar (String description, double buyFor, double sellFor,
                   String type, String colour, String material, int numStrings) {
        super(description, buyFor, sellFor, type, colour, material);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public String play() {
        return "Strum Strum";
    }
}
