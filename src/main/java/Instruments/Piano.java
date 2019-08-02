package Instruments;

public class Piano extends Instrument {
    private int keys;

    public Piano(String type, String colour, String material, int keys) {
        super(type, colour, material);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public String play() {
        return "Plink Plink";
    }
}
