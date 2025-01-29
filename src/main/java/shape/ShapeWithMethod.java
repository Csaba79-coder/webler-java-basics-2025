package shape;

import java.util.Scanner;

import static shape.Shape.SPACE;

public class ShapeWithMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sizeText = "Kérlek add meg a piramis és a négyzet méretét: ";
        String symbolText = "Kérlek add meg a piramist/négyzetet kirajzoló szimbólumot: ";
        int size = getUserNumberInput(scanner, sizeText);
        String symbol = getUserTextInput(scanner, symbolText);
        drawPyramid(size, symbol);
        drawSquare(size, symbol);
    }

    // láthatóság statikus visszatérés metódus neve zárójelben paraméterek
    private static int getUserNumberInput(Scanner scanner, String text) {
        System.out.println(text);
        return scanner.nextInt();
    }

    private static String getUserTextInput(Scanner scanner, String text) {
        System.out.println(text);
        return scanner.next();
    }

    private static void drawSquare(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(symbol + SPACE);
            }
            System.out.println();
        }
    }

    private static void drawPyramid(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol + SPACE);
            }
            System.out.println();
        }
        System.out.println("Juhhuuuuuu :))))))))");
    }
}
