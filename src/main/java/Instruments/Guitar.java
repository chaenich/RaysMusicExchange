package Instruments;

public class Guitar extends Instrument {
    private int strings;

    public Guitar (String type, String colour, String material,  int strings) {
        super(type, colour, material);
        this.strings = strings;
    }

    public int getNumStrings() {
        return strings;
    }

    public String play() {
        return "Strum Strum";
    }
}
