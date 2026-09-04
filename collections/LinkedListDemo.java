package collections;

import java.util.*;
import java.util.List;

public class LinkedListDemo {
    static void main() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.addFirst(56);
        list.addLast(78);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
