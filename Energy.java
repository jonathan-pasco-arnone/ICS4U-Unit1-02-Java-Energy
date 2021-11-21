/**
* This program calculates energy from mass.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-11-20
*/

// Import the Scanner class
import java.util.Scanner;

/**
* This program calculates energy from mass.
*/
final class Logs {

    /**
    * Speed of light squared.
    */
    public static final double SOLS = 299792458 ** 2;

    /**
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Logs() {
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

        // Create a scanner object
        final Scanner myObj = new Scanner(System.in);
        // Ask for inputs
        System.out.println("Please enter mass in kg: ");

        // Stores float in length
        final float mass = myObj.nextFloat();
        
        // Calculations
        energy = mass * SOLS;
        System.out.println("If the mass is " + mass + "kg then the energy is " + energy);

        System.out.println("\nDone.");
    }
}
