package algorithm;

public class MaxSearch {

    public static void main(String[] args) {

        int[] numbers = {3, 6, 6, 1, 9, 9, 4, 2, 8};
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    private static int findMax2(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
