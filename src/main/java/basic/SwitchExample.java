package basic;

public class SwitchExample {

    public static void main(String[] args) {

        int dayOfWeek = 3;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Unknown";
                break;
        }

        System.out.println("Today is " + dayName);

        /*
         String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";
        };
         */

        String input = "hello";
        String output;

        switch (input) {
            case "hello":
                output = "hello";
                break;
            case "Hello":
                output = "Hello hello";
                break;
            default:
                output = "Not hello";
                break;
        }

        System.out.println("Output: " + output);
    }
}
