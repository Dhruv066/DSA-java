package String;

public class stringFormating {
    static void main() {
        String str1 = "dhruv maurya";
        System.out.println(str1 + 56.5+69);
        System.out.println( 56.5+69+str1 );
        String age  = String.format("My age is %d",20);
        System.out.println(age);
        String name1= String.format("My name is %2$s and address is %1$s","Dhruv","lucknow");
        System.out.println(name1);

    }
}
