package decorator;

/**
 * A whip condiment to be added to beverages.
 * 
 * @author Willow Sapphire
 * @version 11/2/2022
 */
public class Whip extends Condiment
{
    /**
     * Creates a new Whip object.
     * 
     * @param drink the drink on which to apply the whip
     */
    public Whip(Beverage drink)
    {
        super(drink, "Whip", 0.15);
    }
}
