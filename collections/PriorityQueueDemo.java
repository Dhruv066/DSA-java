package collections;

import java.util.*;

public class PriorityQueueDemo {
    static void main() {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(1);
        queue.offer(7);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
