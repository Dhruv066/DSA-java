package oops;
import java.util.*;

class Std {
    int rollNo;
    String name;
    int marks;

    Std(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

class MyCustomComparator implements Comparator<Std>{
    // decreasing
    @Override
    public int compare(Std s1, Std s2){
        if(s1.marks < s2.marks){
            return 1;
        }else{
            return -1;
        }
    }
}


public class comparator {
    public static void main(String[] args) {
        List<Std> list = new ArrayList<>();
            list.add(new Std(3, "Amit",50));
            list.add(new Std(1, "Ravi",70));
            list.add(new Std(2, "Neha",80));

            Collections.sort(list, new MyCustomComparator());

        for (Std s : list) {
            System.out.println(s.marks + " " + s.name);
        }
    }
}