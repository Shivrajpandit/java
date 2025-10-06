/**
 * This class demonstrates how to define and call a method in Java.
 * Methods are blocks of code that run only when they are called.
 * They help to organize code and make it reusable.
 */
public class MethodExample {

    // The main method is where program execution begins.
    public static void main(String[] args) {
        String name = "Alice";
        
        // Here, we are 'calling' the sayHello method and passing 'name' as an argument.
        sayHello(name);

        int number1 = 10;
        int number2 = 25;
        // Here, we call the 'add' method and store the returned value in a variable.
        int sum = add(number1, number2);

        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
    }

    /**
     * A simple method that takes a String parameter and prints a greeting.
     * 'public static' are modifiers.
     * 'void' means this method does not return any value.
     * 'sayHello' is the method name.
     * '(String personName)' is the parameter it accepts.
     */
    public static void sayHello(String personName) {
        System.out.println("Hello, " + personName + "!");
    }

    /**
     * A method that takes two integers as parameters and returns their sum.
     * 'int' (before the method name) is the return type.
     */
    public static int add(int a, int b) {
        // The 'return' keyword sends a value back to where the method was called.
        return a + b;
    }
}
