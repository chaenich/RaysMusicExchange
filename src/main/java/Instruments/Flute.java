package Instruments;

public class Flute extends Instrument {
    private int numValves;

    public Flute(String description, double buyFor, double sellFor,
                 InstrumentType type, String colour, String material, int numValves) {
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
