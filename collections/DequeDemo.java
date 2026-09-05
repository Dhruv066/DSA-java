package collections;

import java.util.*;


public class DequeDemo {
    static void main() {
        Deque<Integer> d = new ArrayDeque<>();
        d.offer(1);
        d.offer(2);
        d.offer(36);
        d.offerFirst(48);
        d.offerLast(51);
        System.out.println(d.peek());
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        for (Integer i : d) {
            System.out.print(i+" ");
        }
    }
}
