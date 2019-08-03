package Instruments;

import Behaviours.ISell;

public class Flute extends Instrument implements ISell {
    private int numValves;
    private String description;
    private double buyFor;
    private double sellFor;

    public Flute(String description, double buyFor, double sellFor,
                 String type, String colour, String material, int numValves) {
        super(description, buyFor, sellFor, type, colour, material);
        this.numValves = numValves;
    }

    public int getNumValves() {
        return numValves;
    }

    public String play() {
        return "Peep Peep";
    }
}
