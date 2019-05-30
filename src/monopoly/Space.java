package monopoly;

/**
 *
 * @author William Gore & Raden Pablo
 */
public class Space {

    public String name;
    public boolean isProperty;
    public int price;
    public int rent;
    public boolean owned;
    private String colour;

    // creates non-buyable properties like GO
    public Space(int rent) {
        isProperty = false;
        this.rent = rent;
        owned = true;

    }

    // creates buyable properties
    public Space(int price, int rent, String colour,
            String name) {
        this.price = price;
        this.rent = rent;
        this.colour = colour;
        this.name = name;
        isProperty = true;

    }
}
