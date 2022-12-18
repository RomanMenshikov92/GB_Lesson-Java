// 2.Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() - помещает элемент в конец очереди,
// - dequeue() - возвращает первый элемент из очереди и удаляет его,
// - first() - возвращает первый элемент из очереди, не удаляя.

package homework_04;

import java.util.LinkedList;

import java.util.*;

public class hw_2 {
    public static void main(String[] args) {
        Queue<Integer> start = new LinkedList<>();
        for (int i = 0; i <= 20; i++) {
            start.add(i);
        }
        System.out.println("До " + start);
        System.out.println("- помещает элемент в конец очереди " + enqueue(start, 999));
        System.out.println("- возвращает первый элемент из очереди и удаляет его " + dequeue(start));
        System.out.println("- возвращает первый элемент из очереди, не удаляя " + first(start));
        System.out.println("После " + start);
    }

    public static Queue<Integer> enqueue(Queue<Integer> end, int n) {
        end.add(n);
        return end;
    }

    public static int dequeue(Queue<Integer> end) {
        return end.remove();
    }

    public static int first(Queue<Integer> end) {
        return end.peek();
    }
}
