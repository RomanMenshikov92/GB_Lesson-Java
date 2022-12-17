
// Реализовать простой калькулятор (операции + - / * )
import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Первый операнд(любое число): ");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Операция (+, -, *, /): ");
        String op = scanner.nextLine();
        System.out.println("Второй операнд(любое число): ");
        int number2 = scanner.nextInt();

        scanner.close();

        if (op.equals("+")) {
            System.out.println("Первый операнд + Второй операнд = " + (number1 + number2));
        }
        if (op.equals("-")) {
            System.out.println("Первый операнд - Второй операнд = " + (number1 - number2));
        }
        if (op.equals("*")) {
            System.out.println("Первый операнд * Второй операнд = " + (number1 * number2));
        }
        if (op.equals("/")) {
            System.out.println("Первый операнд / Второй операнд = " + (number1 / number2));
        }

    }
}
