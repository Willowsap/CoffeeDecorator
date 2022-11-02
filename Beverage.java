/**
 * Our general beverage class.
 * 
 * @author Willow Sapphire
 * @version 11/2/2022
 */
public abstract class Beverage {

    /**
     * The cost of the beverage.
     */
    protected double cost;

    /**
     * The description of the beverage.
     */
    protected String description;

    /**
     * Constructs a new beverage.
     * 
     * @param description - the description of the beverage.
     * @param cost - the cost of the beverage.
     */
    public Beverage(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    /**
     * Getter for the beverage's description.
     * @return the description of the bevearge.
     */
    public String description() {
        return this.description;
    }

    /**
     * Getter for the beverage's cost.
     * @return the cost of the beverage.
     */
    public double cost() {
        return this.cost;
    }

    @Override
    public String toString() {
        return String.format("Drink: %s\nCost: $%.2f\n", this.description(), this.cost());
    }
}
