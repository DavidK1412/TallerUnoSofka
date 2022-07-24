package domain;

/**
* Represents a product.
 * @author David
 */

public class Product {
    // Attributes
    /**
     * The product's id.
     */
    private int id;
    /**
     * The product's name.
     */
    public String name;
    /**
     * The product's price.
     */
    public float price;
    /**
     * The product's stock.
     */
    protected int stock;
    /**
     * The product's description.
     */
    public String description;

    /**
     * Constructor.
     * @param id The product's id.
     * @param name The product's name.
     * @param price The product's price.
     * @param stock The product's stock.
     * @param description The product's description.
     */
    public Product(int id, String name, float price, int stock, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }

    /**
     * Get the product's id.
     * @return The product's id.
     */
    public int getId() {
        return id;
    }

    /**
     * Set the product's id.
     * @param id The product's id.
     */
    public void setId(int id) {
        this.id = id;
    }

}
