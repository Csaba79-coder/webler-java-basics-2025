package method;

public class MethodExample {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        printSum(x, y);
        int fixedNum = getFixedNumber();
        System.out.println("A fix szám: " + fixedNum);
        String name = "Tünde";
        String greeting = sayHello(name);
        int age = getFixedNumber();
        String greeting2 = sayHello(name, age);
        System.out.println(greeting2);
        String greetingWithAge = greet(name);
        System.out.println(greetingWithAge);
        String greetingWithAge2 = greet2(name);
        System.out.println(greetingWithAge2);
        String greetingExtra = greetExtra(name);
        System.out.println(greetingExtra);
        int random = getRandomNumber();
        System.out.println("Véletlen szám: " + random);
    }

    // Ha private a metódus, akkor csak ebben a fájlban érhető el
    // Metódus két paraméterrel és nincs visszatérési értéke
    private static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("A számok összege: " + sum);
    }

    // Metódus paraméter nélkül, ami mindig ugyanazt a számot adja vissza
    private static int getFixedNumber() {
        return 20; // Mindig 42-t adunk vissza
    }

    private static String sayHello(String name) {
        return "Hello " + name;
    }

    // Polimorfizmus method overloading
    private static String sayHello(String name, int age) {
        return sayHello(name) + ", aki " + age + " éves.";
    }

    private static String greet(String name) {
        int age = getFixedNumber();
        return "Hello " + name + ", aki " + age + " éves.";
    }

    private static String greet2(String name) {
        return "Hello " + name + ", aki " + getFixedNumber() + " éves.";
    }

    private static String greetExtra(String name) {
        return sayHello(name) + ", aki " + getFixedNumber() + " éves.";
    }

    // Metódus paraméter nélkül és visszatérési értékkel
    private static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }

    // Metódus egy paraméterrel és visszatérési értékkel
    private static int square(int num) {
        return num * num; // Math.pow(num, 2);
    }
}
