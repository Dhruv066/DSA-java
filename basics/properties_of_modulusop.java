package basics;

public class properties_of_modulusop {
    static void main() {
        System.out.println("some properties of modulus operator");
        int a = 53;
        int b = 10;                     //a % b = a if a<b
        System.out.println(a % b);      //a % -b = a%b
        int c = -5;                     //-a % b = -(a%b)
        int d = 2;
        System.out.println(c % d);
        System.out.println(d % c);
    }
}
