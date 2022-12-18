// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package homework_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hw_3 {
    public static void main(String[] args) {
        List<Integer> rnd_arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rnd_arr.add(rndNum());
        }
        System.out.print("Get random array: ");
        System.out.println(rnd_arr);

        System.out.printf("Max number in array: %d\n", Collections.max(rnd_arr));
        System.out.printf("Min number in array: %d", Collections.min(rnd_arr));
    }

    public static int rndNum() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
