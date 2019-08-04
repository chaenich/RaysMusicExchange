package Instruments;

import Behaviours.IPlay;
import Shop.Stock;

public abstract class Instrument extends Stock implements IPlay {
    private InstrumentType type;
    private String colour;
    private String material;

    public Instrument(String description, double buyFor, double sellFor,
                      InstrumentType type, String colour, String material) {
        super(description, buyFor, sellFor);
        this.type = type;
        this.colour = colour;
        this.material = material;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }
}
