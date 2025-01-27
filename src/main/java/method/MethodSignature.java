package method;

public class MethodSignature {

    public static void main(String[] args) {

        // Leteszteljük a működést egy tömbben :)
        int[] numbers = {1, 2, 3, 4, 5};
        int result = sumElements(numbers);
        String text = "Az összeg: ";
        print(text, result);
        int[] arr = {1, 2, 3, 4, 5};
        int res = multiplyElements(arr);
        print("A szorzat: ", res);
    }

    /**
     * Metódus, amely összeadja a bemeneti tömb elemeit.
     *
     * @param arr a bemeneti tömb, amelynek elemeit össze akarjuk adni
     * @return az összeg, amelyet az elemekből kaptunk
     */
    public static int sumElements(int[] arr) {
        // Szignatúra:
        // - Visszatérési típus: int (az összeg)
        // - Metódusnév: sumArrayElements - mindig igével kezdődik!
        // - Paraméter: int[] arr (egész számok tömbje)

        // Paraméter:
        // - int[] arr: az input paraméter, egy egész számok tömbje

        // Body (metódusmag):
        // - Itt történik az összeadás logikája
        // - Kezdetben az összeg 0
        int sum = 0;
        // Ciklus:
        // - Egy for ciklus segítségével iterálunk végig a bemeneti tömb elemein
        // - A tömb hosszúsága (arr.length) határozza meg az iterációk számát
        /*for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }*/
        for (int num : arr) {  // ezzel ugyanazt érjük el, de itt közvetlen az értékhez férünk hozzá! index nem érdekel
            sum += num;
        }
        return sum;
    }

    private static void print(String text, int number) {
        System.out.println(text + number);
    }

    public static int multiplyElements(int[] arr) {
        int result = 1;
        for (int num : arr) {
            result *= num;
        }
        return result;
    }
}
