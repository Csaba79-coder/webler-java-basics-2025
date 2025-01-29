package shape;

import java.util.Scanner;

public class ShapeAdam {

    static Scanner scanner = new Scanner(System.in);
    final static String SPACE = " ";
    final static String SEPARATOR = "-";

    public static void main(String[] args) {
        int size = getNumberFromUser(scanner);
        String character = getCharacterForShape(scanner);
        drawHorizontalLine(size);
        drawSquare(size, character);
        drawHorizontalLine(size);
        drawPyramid(size, character);
        drawHorizontalLine(size);
    }

    private static int getNumberFromUser(Scanner scanner) {
        System.out.print("Kérem a piramis méretét: ");
        return scanner.nextInt();
    }

    private static String getCharacterForShape(Scanner scanner) {
        System.out.print("Kérem a karakter: ");
        return scanner.next();
    }

    private static void drawSquare(int size, String character) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(character + SPACE);
            }
            System.out.println();
        }
    }

    private static void drawPyramid(int size, String character) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(character + SPACE);
            }
            System.out.println();
        }
    }

    private static void drawHorizontalLine(int size) {
        for (int i = 0; i < size * 2; i++) {
            System.out.print(SEPARATOR);
        }
        System.out.println();
    }
}
