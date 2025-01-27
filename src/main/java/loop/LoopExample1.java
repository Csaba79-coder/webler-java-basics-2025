package loop;

public class LoopExample1 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        // for each loop
        for (int number: numbers) {
            System.out.println(number);
        }

        for (int number: numbers) {
            if (number == 3) {
                System.out.println("Found 3");
            }
        }

        int[] numbers2 = {1, 2, 3, 4, 5, 3};

        for (int number: numbers2) {
            if (number == 3) {
                System.out.println("Found 3");
            }
        }

        System.out.println("--------------------");
        System.out.println("Break:");
        for (int number: numbers2) {
            if (number == 3) {
                System.out.println("Found 3 at first occurrence");
                break; // break the loop
            }
            System.out.println("Processing number: " + number);
        }

        System.out.println("\nContinue:");
        for (int number: numbers2) {
            if (number == 3) {
                System.out.println("Found 3");
                continue; // skip the current iteration
            }
            System.out.println("Processing number: " + number);
        }

        System.out.println("--------------------");
        // fori loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index: " + i + ", value: " + numbers[i]);
        }

        System.out.println("--------------------");
        System.out.println("i + 3");
        for (int i = 0; i < numbers.length; i += 3) {
            System.out.println("Index: " + i + ", value: " + numbers[i]);
        }

        // never ending loop :)
        /*for (int i = 0; i < 100; i--) {
            System.out.println("Index: " + i);
        }*/
        System.out.println("Nothing:");
        for (int i = 0; i > 100; i--) {
            System.out.println("Index: " + i);
        }
        System.out.println("--------------------");
        System.out.println("Wrong condition:");
        for (int i = 0; i > 100; i++) {
            System.out.println("Index: " + i);
        }
        System.out.println("--------------------");
        for (int i = 150; i >= 100; i--) {
            System.out.println("Index: " + i);
        }

        // 14,99 - 15 egyik oldal legyen pl. megengedő, akkor nem marad ki semmilyen szám!
        // 14,99000000001
        // 14,99999999999
        // 14,99 - 15,00 de akkor a végeredményt, amit kapsz, azt kerekitsd 2 tizedesre!

        System.out.println("--------------------");
        System.out.println("IndexOutOfBoundsException:"); // ArrayIndexOutOfBoundsException
        /*for (int i = 0; i <= numbers.length; i++) {
            System.out.println("Index: " + i + ", value: " + numbers[i]);
        }*/
    }
}
