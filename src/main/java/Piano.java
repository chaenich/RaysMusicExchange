public class Piano {
    private String type;
    private int keys;
    private String colour;
    private String material;

    public Piano(String type, int keys, String colour, String material) {
        this.type = type;
        this.keys = keys;
        this.colour = colour;
        this.material =  material;
    }

    public String getType() {
        return type;
    }

    public int getKeys() {
        return keys;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }
}
