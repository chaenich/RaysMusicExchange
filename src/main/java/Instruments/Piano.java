package Instruments;

public class Piano extends Instrument {
    private int numKeys;

    public Piano(String type, String colour, String material, int numKeys) {
        super(type, colour, material);
        this.numKeys = numKeys;
    }

    public int getNumKeys() {
        return numKeys;
    }

    public String play() {
        return "Plink Plink";
    }
}
