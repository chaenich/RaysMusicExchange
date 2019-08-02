package Instruments;

public class Flute extends Instrument {
    private int valves;

    public Flute(String type, String colour, String material, int valves) {
        super(type, colour, material);
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    public String play() {
        return "Peep Peep";
    }
}
