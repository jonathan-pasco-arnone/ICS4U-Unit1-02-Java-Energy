/*
* This program calculates energy from mass.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-11-20
*/

// Imports.
import java.util.Scanner;

/**
* This program calculates energy from mass.
* (remember to change the name after "final class").
*/
final class Energy {

    /**
    * Speed of light squared.
    */
    public static final double SOLS = Math.pow(299792458, 2);

    /**
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Variables
        final double energy;
        final float mass;
        // Create a scanner object
        final Scanner myObj = new Scanner(System.in);
        // Ask for inputs
        System.out.println("Please enter mass in kg: ");

        /*
        * This accepts an inputted and tests it.
        */
        try {
            // Stores float in variable.
            mass = myObj.nextFloat();

            // Calculations
            energy = mass * SOLS;
            System.out.println("If the mass is " + mass +
                "kg then the energy is " + energy);
            }
        catch (java.util.InputMismatchException ex) {
            System.out.println("That was not a valid integer");
            }
        finally {
            System.out.println("\nDone.");
        }
    }
}
