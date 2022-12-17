// Вывести все простые числа от 1 до 1000 

public class hw_2 {
    public static boolean number(int num, int divisor) {
        if (divisor > num * 0.5 + 1)
            return true;
        if (num % divisor == 0)
            return false;
        else
            return number(num, divisor + 1);
    }

    public static void main(String[] args) {
        String result = "1 ";

        for (int i = 3; i < 1000; i++) {
            if (number(i, 2)) {
                result = result + String.valueOf(i) + " ";
            }

        }
        System.out.printf(result);
    }
}
