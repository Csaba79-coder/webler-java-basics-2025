import method.MethodSignature;

import static algorithm.FindElementExample.nums;

public class Main {

    // CTRL + ALT + L -> code formatting (but not solving all issues!)
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int result = MethodSignature.multiplyElements(numbers);
        System.out.println("The result is: " + result);

        System.out.println("-----------------");
        System.out.println("The result is: " + MethodSignature.multiplyElements(numbers));
        for (int i = 0; i < nums.length; i++) {
            System.out.println("The element at index " + i + " is: " + nums[i]);
        }
    }
}
