package decorator;

/**
 * A milk condiment to be added to beverages.
 * 
 * @author Willow Sapphire
 * @version 11/2/2022
 */
public class Milk extends Condiment
{
    /**
     * Creates a new milk condiment on a drink.
     * 
     * @param drink - the drink to which to add milk.
     */
    public Milk(Beverage drink)
    {
        super(drink, "Milk", 0.1);
    }
}
