package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class std implements Comparable<std>
{
    int age;
    String name;
    int rollno;
    std(int rollno,String name , int age ){
        this.name=name ;
        this.rollno=rollno;
        this.age=age;
    }
    @Override
    public int compareTo(std that) {
        if(this.age<that.age){
            return -1;
        }else{
            return 1;
        }
    }
}
public class comparableDemo {
    static void main() {
        List<std> list = new ArrayList<>();
        list.add(new std(1,"Dhruv",23));
        list.add(new std(3,"saurabh",18));
        list.add(new std(2,"shaurya",20));
        Collections.sort(list);
        for(std s:list){
            System.out.println("name:"+s.name+",age:"+s.age);
        }
    }
}
