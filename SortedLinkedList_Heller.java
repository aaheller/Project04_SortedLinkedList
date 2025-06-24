/*
SortedLinkedList_Heller
Aaron Heller
June 10, 2025

Instructions for Compiling, Running, and Generating Javadoc:

Compile this program in cmd line:
javac SortedLinkedList_Heller.java

Run the compiled program in cmd line:
java SortedLinkedList_Heller

Generate Javadoc documentation for this program in cmd line:
javadoc SortedLinkedList_Heller.java

*/

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * The program reads integers from the console, stores them in a LinkedList, and sorts from smallest to largest number.
 *
 * Design:
 * 1. Initialize a LinkedList that can have elements added.
 * 2. Use Scanner for reading user input.
 * 3. Continuously prompt for integers until "done" is entered.
 * 4. Handle non-integer input.
 * 5. Sort the list using Java's built-in Collections utility.
 * 6. Print the sorted numbers.
 *
 * In this program I only used standard Java library classes.
 */

public class SortedLinkedList_Heller {

    /**
     * This is just the basic setup for making a new `SortedLinkedList_Heller`.
     * Including this comment here mainly to keep Javadoc happy and avoid a 'no comment' warning for the constructor.
     */
    public SortedLinkedList_Heller() {
    }

    /**
     * Entry point for the program.
     * Manages the input, list population, and sorting process.
     *
     * @param args Command-line arguments (not used).
     */

    public static void main(String[] args) {

        // CODE REUSE: Using java.util.LinkedList
        // Code reuse because this is a pre-built data structure. There's no need to set-up how elements are linked or how the list grows/shrinks from scratch.
        //
        LinkedList<Integer> numbers = new LinkedList<>();

        // CODE REUSE: Using java.util.Scanner
        // Useful code reuse as Scanner is a pre-built utility that handles input operations.
        //
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter integer numbers. Type the number and press Enter. When you're done entering numbers, type 'done' and press Enter.");

        while (inputScanner.hasNext()) {
            String line = inputScanner.next();

            // Break condition, exit input loop if "done" is entered.
            if (line.equalsIgnoreCase("done")) {
                break;
            }


            try {
                // Try to parse input string into an integer.
                int number = Integer.parseInt(line);
                numbers.add(number);

            } catch (NumberFormatException e) {

                // Error Warning
                System.out.println("Invalid entry. Try again or type 'done' and press Enter.");
            }
        }

        inputScanner.close();

        // CODE REUSE: Using java.util.Collections.sort()
        // Code reuse because of using this method to avoid implementing a sorting algorithm from scratch.
        Collections.sort(numbers);

        System.out.println("\nSorted numbers (smallest to largest):");

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}