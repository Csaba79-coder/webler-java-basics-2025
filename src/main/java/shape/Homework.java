package shape;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg a piramis méretét: ");
        int size = scanner.nextInt();
        System.out.println("Kérlek add meg a piramist alkotó szimbólumokat: ");
        String symbol = scanner.next();
        drawFullPyramid(size, symbol);
        System.out.println("------------");
        drawFullPyramidUpsideDown(size, symbol);
        System.out.println("------------");
        System.out.println("Kérlek add meg a magasságát a téglalapnak: ");
        int height = scanner.nextInt();
        System.out.println("Kérlek add meg a szélességét a téglalapnak: ");
        int width = scanner.nextInt();
        drawRectangle(height, width, symbol);
        System.out.println("------------");
        System.out.println("Mi van, ha a paramétereket más sorrendben adom be a metódusban, de típus ugyanaz? HÁT EZ!!! ...");
        drawRectangle(width, height, symbol);
    }

    // Teljes piramis rajzoló metódus
    private static void drawFullPyramid(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            // Először a sor előtti szóközök kiírása
            for (int j = size - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // Majd a csillagok (szimbólum) kiírása a sorban
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(symbol);
            }
            /*
            for (int j = 0; j <= 2; j++) {
                System.out.print(symbol + " ");
            }
            */
            System.out.println();
        }
    }

    // Fordított piramis rajzoló metódus
    private static void drawFullPyramidUpsideDown(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            // Először a sor előtti szóközök kiírása
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Majd a csillagok (szimbólum) kiírása a sorban
            for (int j = 0; j < 2 * (size - i) - 1; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    // Téglalap rajzoló metódus
    private static void drawRectangle(int height, int width, String symbol) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
