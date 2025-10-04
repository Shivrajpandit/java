/**
 * This class demonstrates the use of a switch statement in Java.
 * A switch statement allows a variable to be tested for equality against a list of values.
 */
public class SwitchExample {

    public static void main(String[] args) {
        // We'll use an integer to represent the day of the week
        int dayOfWeek = 4; // 1 for Sunday, 2 for Monday, ..., 7 for Saturday
        String dayName;

        // The switch statement will select one of many code blocks to be executed.
        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break; // The 'break' keyword exits the switch block.
        }

        // Print the result
        System.out.println("Day " + dayOfWeek + " is a " + dayName);
    }
}
