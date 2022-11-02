/**
 * Decorates a drink with a condiment.
 * 
 * @author Willow Sapphire
 * @version 11/2/2022
 */
public abstract class Condiment extends Beverage {
    
    /**
     * This is the drink that the condiment is being added to.
     */
    private Beverage drink;

    /**
     * Creates a new condiment and adds it to the drink.
     * 
     * @param drink - the drink to which to add the condiment.
     * @param description - the description of the condiment.
     * @param cost - the cost of the condiment.
     */
    public Condiment(Beverage drink, String description, double cost) {
        super(description, cost);
        this.drink = drink;
    }

    @Override
    public double cost() {
        // we have to override the cost method to not just return our cost,
        // but also the cost of the drink we were added to.
        return this.cost + drink.cost();
    }

    @Override
    public String description() {
        // we have to override the description method to not just return our description,
        // but also the description of the drink we were added to.
        return this.description + ", " + drink.description();
    }
}
