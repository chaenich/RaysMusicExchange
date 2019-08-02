public class Guitar {
    private String type;
    private int strings;
    private String colour;
    private String material;

    public Guitar (String type, int strings, String colour, String material) {
        this.type = type;
        this.strings = strings;
        this.colour = colour;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public int getStrings() {
        return strings;
    }

    public String getColour() {
        return colour;
    }
}
