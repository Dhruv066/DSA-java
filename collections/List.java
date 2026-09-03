package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class List {
    static void main() {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(5);
        list.addLast(6);
        System.out.println(list);
        list.remove(2);
        list.remove(Integer.valueOf(3));
        System.out.println(list);
        ListIterator itr = list.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
