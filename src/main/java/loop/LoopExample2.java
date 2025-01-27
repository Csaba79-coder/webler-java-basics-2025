package loop;

public class LoopExample2 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        // while loop
        int i = 0;
        while (i < numbers.length) {
            System.out.println("Index: " + i + ", value: " + numbers[i]);
            i++;
        }

        int j = 0;
        while (j < numbers.length) {
            if (numbers[j] == 3) {
                System.out.println("Found 3");
            }
            j++;
        }

        // végtelen ciklus!!!
        /*int num = 0;
        while (num < 100) {
            System.out.println("Number: " + num);
            num--;
        }*/

        // végtelen loop
        /*int k = 50;
        while (k < 100) {
            System.out.println("Index: " + k);
        }*/

        // do-while loop
        System.out.println("--------------------");
        System.out.println("do-while loop:");
        int l = 0;
        do {
            System.out.println("Index: " + l + ", value: " + numbers[l]);
            l++;
        } while (l < numbers.length);

        // Összegzés
        // Ciklus tíusa   | Használat                                        | Mikor?
        // For each       | Elemenként iterálás a kollekcióban               | Ha nem kell index, csak bejárás
        // Fori (classic) | Kontrollált iteráció index alapján               | Ha pontos iteráció és index kell
        // While          | Feltétel igazsága szerint ismétlődik             | Ha nem ismert az iterációk száma előre
        // Do-while       | Legalább egyszer lafut, majd feltételt ellenőriz | Ha legalább egy iteráció garantált
    }
}
