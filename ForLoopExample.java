/**
 * This class demonstrates a basic 'for' loop in Java.
 * 'For' loops are used to execute a block of code a known number of times.
 */
public class ForLoopExample {

    public static void main(String[] args) {
        System.out.println("Starting a countdown from 10.");

        // This 'for' loop will iterate from 10 down to 1.
        // It has three parts:
        // 1. Initialization (int i = 10): Executed once at the beginning.
        // 2. Condition (i > 0): Checked before each iteration. The loop continues as long as this is true.
        // 3. Iteration (i--): Executed at the end of each iteration.
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Blast off!");
    }
}
