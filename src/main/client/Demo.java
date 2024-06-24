package client;

import decorator.Beverage;
import decorator.DarkRoast;
import decorator.LightRoast;
import decorator.Milk;
import decorator.Sugar;

/**
 * Driver for testing our beverage system.
 * 
 * @author Willow Sapphire
 * @version 11/2/2022
 */
public class Demo
{
    /**
     * Main method to run our manual tests.
     * @param args - unused.
     */
    public static void main(String[] args)
    {
        // Polymorphic
        // Start out with a base drink
        Beverage myDrink = new DarkRoast();

        // NOT polymorphic
        // DarkRoast drink1 = new DarkRoast();
        // Beverage drink2 = new Beverage();


        System.out.println(myDrink);

        // Add a decorator
        myDrink = new Sugar(myDrink);
        System.out.println(myDrink);

        // Add as many as you want.
        myDrink = new Milk(myDrink);
        System.out.println(myDrink);

        /*
         * Walk through these different constructors and method calls.
         * Do you understand what is happening?
         * Try creating a new base beverage and a new condiment
         * Try using your new classes.
         * 
         * Try to re-write the condiment class.
         * That is the most difficult class to understand here.
         */
    }
}
