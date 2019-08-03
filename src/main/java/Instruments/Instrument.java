package Instruments;

import Behaviours.IPlay;
import Shop.Stock;

public abstract class Instrument extends Stock implements IPlay {
    private String type;
    private String colour;
    private String material;

    public Instrument(String description, double buyFor, double sellFor,
                      String type, String colour, String material) {
        super(description, buyFor, sellFor);
        this.type = type;
        this.colour = colour;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }
}
