package collections;

import java.util.*;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(15);
        set.add(11);
        set.add(12);
        set.add(16);
        set.remove(16);
        System.out.println(set);
    }
}
