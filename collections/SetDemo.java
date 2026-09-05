package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    static void main() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.contains(1));
        set.remove(2);
        for (Integer i : set) {
            System.out.print(i+" ");
        }
    }
}
