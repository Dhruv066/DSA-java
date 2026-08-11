package oops;

public class car {
    String color;
    int model;
    String Company;
    car(){
        this.color = "red";
        this.model = 2021;
        this.Company = "bmw";
    }
}
class democlass {
    static void main() {
        car c1 = new car();
        System.out.println(c1.color);
    }
}
