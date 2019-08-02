package Instruments;

public class Flute extends Instrument {
    private int numValves;

    public Flute(String type, String colour, String material, int numValves) {
        super(type, colour, material);
        this.numValves = numValves;
    }

    public int getNumValves() {
        return numValves;
    }

    public String play() {
        return "Peep Peep";
    }
}
