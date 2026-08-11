package oops;
class country{
    String name;
    String Lang;
    boolean isDemocratic;
    country(){
        this.name="usa";
        this.Lang="english";
        this.isDemocratic=true;

    }
    country(String name,String Lang){
        this();
        System.out.println("before "+this.name);
        this.name=name;
        this.Lang=Lang;
        this.isDemocratic=true;
        System.out.println("after "+this.name);
    }
}
public class constructor {
    public static void main(String[] args) {
        country c1 = new country("india","hindi");
        System.out.println(c1.name);
    }
}
