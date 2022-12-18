// Пусть дан произвольный список целых чисел, удалить из него четные числа
package homework_03;

import java.util.*;

public class hw_2 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            lst.add((int) (Math.random() * 100));
        }
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }
        // iterator - collection
        Iterator<Integer> rnd = lst.iterator();
        while (rnd.hasNext()) {
            if (rnd.next() % 2 == 0) {
                rnd.remove();
            }
        }
        System.out.println();
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }

    }
}
