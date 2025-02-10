package shape;

import java.util.Scanner;

public class ExtraShape {

    private static final char SPACE = ' ';
    private static final String SEPARATOR = "--------------------------";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sizeMessage = "Kérlek add meg a méretet: ";
        int size = getNumberFromUser(scanner, sizeMessage);
        String symbolMessage = "Kérlek add meg a szimbólumot: ";
        char symbol = getSymbolFromUser(scanner, symbolMessage);

        display(size, symbol);
    }

    private static void display(int size, char symbol) {
        drawTrapezoid(symbol, size);
        println(SEPARATOR);
        drawRhombus(symbol, size);
        println(SEPARATOR);
        drawEllipse(symbol, size);
        println(SEPARATOR);
        drawCircle(symbol, size);
    }

    private static void drawTrapezoid(char symbol, int size) {
        for (int i = 0; i < size; i++) {
            // A baloldali és a jobb oldali szóközök a formát alkotják
            for (int j = 0; j < size - i - 1; j++) {
                print(SPACE);
            }
            for (int k = 0; k < size + i * 2; k++) {
                print(symbol);
            }
            System.out.println();
        }
    }

    private static void drawRhombus(char symbol, int size) {
        // Felső háromszög
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                print(SPACE);
            }
            for (int k = 0; k < size + i * 2; k++) {
                print(symbol);
            }
            println();
        }

        // Alsó háromszög
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < size - i - 1; j++) {
                print(SPACE);
            }
            for (int k = 0; k < size + i * 2; k++) {
                print(symbol);
            }
            println();
        }
    }

    private static void drawEllipse(char symbol, int size) {
        int radius = size / 2;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                int x = i - radius;
                int y = j - radius;
                // A kör egyenlete (x^2 + y^2 = r^2)
                if (x * x + y * y <= radius * radius + radius) {
                    print(symbol);
                } else {
                    print(SPACE);
                }
            }
            println();
        }
    }

    private static void drawCircle(char symbol, int size) {
        // Consider a rectangle of size N * N
        int N = 2 * size + 1;

        int x, y; // Coordinates inside the rectangle

        // Draw a square of size N * N.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Start from the left most corner point
                x = i - size;
                y = j - size;

                // If this point is inside the circle, print it
                if (x * x + y * y <= size * size + 1)
                    print(symbol);
                else
                    // If outside the circle, print space
                    print(SPACE);
                print(SPACE);
            }
            println();
        }
    }

    private static int getNumberFromUser(Scanner scanner, String message) {
        println(message);
        return scanner.nextInt();
    }

    private static char getSymbolFromUser(Scanner scanner, String message) {
        println(message);
        return scanner.next().charAt(0);
    }

    private static void println(String message) {
        System.out.println(message);
    }

    private static void println() {
        System.out.println();
    }

    private static void print(char character) {
        System.out.print(character);
    }
}

