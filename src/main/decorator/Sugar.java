package decorator;

/**
 * A sugar condiment to be added to beverages.
 * 
 * @author Willow Sapphire
 * @version 11/2/2022
 */
public class Sugar extends Condiment
{
    /**
     * Creates a new milk condiment on a drink.
     * 
     * @param drink - the drink to which to add milk.
     */
    public Sugar(Beverage drink)
    {
        super(drink, "Sugar", 0.3);
    }
}
