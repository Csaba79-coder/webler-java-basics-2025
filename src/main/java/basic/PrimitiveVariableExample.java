package basic;

public class PrimitiveVariableExample {

    public static void main(String[] args) {

        // byte: -128 és 127 között, alapértelmezett érték: 0
        byte num1 = 0;

        // short: -32,768 és 32,767 között, alapértelmezett érték: 0
        short num2 = 0;

        // int: -2^31 és (2^31)-1 között, alapértelmezett érték: 0
        int num3 = 0;

        // long: -2^63 és (2^63)-1 között, alapértelmezett érték: 0
        long num4 = 0L;

        // float: kb. 1.4E-45 és kb. 3.4E+38 között, alapértelmezett érték: 0.0
        float num5 = 0.0f;

        // double: kb. 4.9E-324 és kb. 1.8E+308 között, alapértelmezett érték: 0.0
        double num6 = 0.0;

        // char: Unicode karakterek, alapértelmezett érték: '\u0000'
        char letter1 = '\u0000';
        char letter2 = 'b';

        // boolean: true vagy false, alapértelmezett érték: false
        boolean isValid = false;

        // Változók kiíratása új sorba
        System.out.println("byteVariable: " + num1);
        System.out.println("shortVariable: " + num2);
        System.out.println("intVariable: " + num3);
        System.out.println("longVariable: " + num4);
        System.out.println("floatVariable: " + num5);
        System.out.println("doubleVariable: " + num6);
        System.out.println("charVariable: " + letter1);
        System.out.println("char2: " + letter2);
        System.out.println("booleanVariable (érvényes): " + isValid);

        System.out.println("--------------");

        // Egymás mellé kiíratás
        System.out.printf("byteVariable: " + num1);
        System.out.printf("shortVariable: " + num2);

        // Egymás mellé kiíratás
        System.out.printf("byteVariable: " + num1);
        System.out.printf("shortVariable: " + num2);
        System.out.println("\n");
        System.out.println("--------------");

        // Egymás mellé kiíratás helyett új sorba, de escape karakterrel
        System.out.printf("byteVariable: " + num1 + "\n");
        System.out.printf("shortVariable: " + num2);
        System.out.println("--------------");

        // a \t egy escape char. lásd extra anyagokban, felsorolva mind!
        // legjobb módszer, ha kipróbálod!!!
        // TODO: homework / házi feladat, ezeket is gyakorolni kell :)
        System.out.println("byteVariable: \t" + num1);

        // formázás:
        int number = 10;
        int anotherNumber = 100;
        double pi = 3.14159;
        // https://www.geeksforgeeks.org/format-specifiers-in-java/
        System.out.printf("A szám: %d, az értéke: %.2f \n", number, pi); // jövőben majd String format!!! :)
        System.out.printf("A szám: %d, az értéke: %.4f \n", number, pi);
        System.out.printf("A szám: %d x 10 az érték: %d \n", number, anotherNumber);
        System.out.printf("A szám: %d x %d az érték: %d \n", number, number, anotherNumber);
    }
}
