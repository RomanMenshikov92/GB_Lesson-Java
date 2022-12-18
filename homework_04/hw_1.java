// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список
package homework_04;

import java.util.LinkedList;

public class hw_1 {
    public static void main(String[] args) {

        int[] rnd_arr = { 5, 3, 2, 6, 7, 4, 9, 1, 44, -1, -5 };
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (Integer n : rnd_arr) {
            linkedList.add(n);
        }

        int n = 0;
        while (n != linkedList.size() - 1) {
            linkedList.add(linkedList.size() - n, linkedList.getFirst());
            linkedList.removeFirst();
            n++;
        }

        System.out.println("linkedList (Перевернутый список) = " + linkedList);

    }
}
