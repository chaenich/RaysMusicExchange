package Instruments;

import Behaviours.IPlay;

public abstract class Instrument implements IPlay {
    private String type;
    private String colour;
    private String material;

    public Instrument(String type, String colour, String material) {
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
