package algorithm;

public class FindElementExample {

    public static void main(String[] args) {

        int[] numbers = {3, 6, 1, 9, 66, 2, 8};
        int foundNumber = 66;
        int indexOfFoundNumber = findIndexOfElement(numbers, foundNumber);
        System.out.println("The index of the found number is: " + indexOfFoundNumber);
        int notFoundNumber = 100;
        int indexOfNotfoundNumber = findIndexOfElement(numbers, notFoundNumber);
        System.out.println("The index of the not found number is: " + indexOfNotfoundNumber);
        int min = findMin(numbers);
        System.out.println("The minimum number is: " + min);
    }

    private static int findIndexOfElement(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }

    private static int findMin(int[] numbers) {
        int index = 0;
        int sequence = 1;

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("The array is empty or null!");
        }

        // 3, 6, 1, 9, 66, 2, 8
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                index = i;
                sequence = index + 1;
            }
        }
        System.out.println("The minimum number is: " + min);
        System.out.println("The index of the minimum number is: " + index);
        System.out.println("The sequence of the minimum number is: " + sequence);
        return min;
    }
}
