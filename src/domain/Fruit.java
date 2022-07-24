package domain;

import java.util.ArrayList;

/**
 * Represents a fruit.
 * @author David
 */

public class Fruit {

    // Attributes

    /**
     * The name of the fruit.
     */
    public String name;
    /**
     *  The average weight of the fruit.
     */
    private float averageWeight;
    /**
     * The color(s) of the fruit.
     */
    public ArrayList<String> colors;

    /**
     * Constructor.
     * @param name The name of the fruit.
     * @param averageWeight The average weight of the fruit.
     * @param colors The color(s) of the fruit.
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Get the fruit color(s).
     * @return The list of colors of the fruit.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /*
    * Add a new color to the list of colors.
    * @param color The color to add.
    */
    public void setColor(String color) {
        this.colors.add(color);
    }
}
