import java.util.*;
import java.io.*;

public class Temperature {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("test.txt"));

        int days = 0;
        // Input the number of days from the file.
        while (input.hasNextInt()) {
            days++;
            if (input.next() == null)
                break;
        }
        System.out.println(days);

        // Declare an array, maybe should check if days is positive
        int[ ] temps = new int[days];

        // Input and store the temperatures in the array
        for (int i = 0; i < temps.length; i++) {
            temps[i] = input.nextInt( );
        }

        // Close the file.  This is not really needed because
        // Java will close the file once the program ends.
        input.close( );

        // Calculate and print the average
        int sum = 0;
        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }
        // need a cast to avoid integer division
        double average = (double) sum / temps.length;
        System.out.println("Average temp = " + average);

        // Count the number of values that were above average
        int count = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        System.out.println(count + " days were above average");
    }
}
