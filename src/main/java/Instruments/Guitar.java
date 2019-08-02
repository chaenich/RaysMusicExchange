package Instruments;

public class Guitar extends Instrument {
    private int strings;

    public Guitar (String type, String colour, String material,  int strings) {
        super(type, colour, material);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public String play() {
        return "Strum Strum";
    }
}
