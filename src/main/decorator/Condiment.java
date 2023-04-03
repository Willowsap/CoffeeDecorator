package decorator;

/**
 * Decorates a drink with a condiment.
 * 
 * @author Willow Sapphire
 * @version 11/2/2022
 */
public abstract class Condiment extends Beverage
{
    /**
     * This is the drink that the condiment is being added to.
     */
    private Beverage drink;

    /**
     * Creates a new condiment and adds it to the drink.
     * 
     * @param drink - the drink to which to add the condiment
     * @param description - the description of the condiment
     * @param cost - the cost of the condiment
     */
    public Condiment(Beverage drink, String description, double cost)
    {
        super(description, cost);
        this.drink = drink;
    }

    /**
     * Adds the cost of the beverage and the condiment.
     * 
     * @return the sum of the beverage and condiment cost
     */
    @Override
    public double cost()
    {
        return this.cost + this.drink.cost();
    }

    /**
     * Concatenates the description of the condiment with the
     * description of the bevarage separated by a comma.
     */
    @Override
    public String description()
    {
        return this.description + ", " + this.drink.description();
    }
}
