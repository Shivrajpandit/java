/**
 * This class demonstrates a basic 'while' loop in Java.
 * A 'while' loop executes a block of code as long as a specified condition is true.
 */
public class WhileLoopExample {

    public static void main(String[] args) {
        int count = 0;
        System.out.println("This loop will print numbers as long as count is less than 5.");

        // The condition (count < 5) is checked BEFORE each loop iteration.
        // If the condition is false initially, the loop will not execute at all.
        while (count < 5) {
            System.out.println("Count is: " + count);
            // It's important to change the variable in the condition,
            // otherwise, you might create an infinite loop!
            count++; // Increment the count
        }

        System.out.println("Loop finished.");
    }
}
