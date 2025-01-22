package basic;

import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();

        System.out.println("Enter a number: ");
        int dayOfWeek = new Scanner(System.in).nextInt();
        // int dayOfWeek = 6;
        String dayName; // regarding CleanCode it is better to declare variables as late as possible (more elegant)
        // String dayName = "";

        if (dayOfWeek == 1) {
            dayName = "Monday";
        } else if (dayOfWeek == 2) {
            dayName = "Tuesday";
        } else if (dayOfWeek == 3) {
            dayName = "Wednesday";
        } else if (dayOfWeek == 1 || dayOfWeek == 3) { // redundant condition
            dayName = "Nothing";
        } else {
            dayName = "Unknown";
        }

        System.out.println("Today is " + dayName);
    }
}
