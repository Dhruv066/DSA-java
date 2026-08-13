package oops;

abstract class shape{
    public abstract double area();
}
class circle  extends shape{
    double radius;
    circle(double radius){

        this.radius=radius;
    }
    public double area(){
        return 3.14 * radius *  radius ;
    }
}
class rectangle extends shape{
    double length;
    double breadth;
    rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
        return length * breadth;
    }
}
public class abstraction {
    public static void main() {
        shape r = new rectangle(10,20);
        shape c= new circle(10);
        System.out.println("Area of rectangle is: " + r.area());
        System.out.println("Area of circle is: " + c.area());

    }
}