package oops;
class a {
    final int age = 52;
    private String name = "dhruv";
    void f(){
        System.out.println("this is a class function");
    }
}
class b extends a{
    void f(){
//        System.out.println(name ); name cant be accesses due to private
//        similarly protected dont allow to use in other package
        super.f();
        System.out.println("this is b class function");
    }
}
public class modifiers {
    static void main() {
        a ob = new b();
        ob.f();
    }
}
