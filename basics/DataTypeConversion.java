package basics;

public class DataTypeConversion {
    static void main() {
        char ch = 'a';
        int c = (int)ch; // explicit conversion
        System.out.println(c);
        char ch2= 'd';
        int d = ch2; // implicit conversion
        System.out.println(d);
        System.out.println(ch2+0); // o/p is 100 because char + int = int

    }
}
