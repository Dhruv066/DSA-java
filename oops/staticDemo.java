package oops;
class  student {
    String name;
    static String collegeName;
    static String cityName;
    static{
        System.out.println("static invoked");
        String collegeName= "BIET";
        String cityName ="Lucknow" ;
    }
    student(){
        this.name="Dhruv";
    }
    public static void greet(){
        System.out.println("hello students");
    }
}
public class staticDemo {
    public static void main(String[] args) {
        student.greet();

    }
}
