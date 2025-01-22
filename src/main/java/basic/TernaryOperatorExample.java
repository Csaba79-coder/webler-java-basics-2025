package basic;

import java.util.Scanner;

public class TernaryOperatorExample {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();
        //              feltétel  ?  ha igan : ha hamis
        String status = age >= 18 ? "Adult" : "Minor";
        System.out.println("Status: " + status);
    }
}

