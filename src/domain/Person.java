package domain;

import java.util.Date;

/**
 * Represents a person.
 * @author David
 */

public class Person {
    // Attributes
    /**
     * The person's name.
     */
    public String name;
    /**
     * The person's first last name.
     */
    public String lastName1;
    /**
     * The person's second last name.
     */
    public String lastName2;
    /**
     * The person's birth date.
     */
    public Date dateBirth;
    /**
     * The person's height.
     */
    public float height;

    /**
     * Constructor.
     * @param name The person's name.
     * @param lastName1 The person's first last name.
     * @param lastName2 The person's second last name.
     * @param dateBirth The person's birth date.
     * @param height The person's height.
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Set the person's name.
     * @param name The person's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * Get the person's name.
    * @return The person's name.
     */
    public String getName() {
        return name;
    }
}
