package oops;
class battery {
    battery(){
        System.out.println(" device battery");
    }
}
class lithiumBattery extends battery{
    lithiumBattery(){
        System.out.println(" device lithiumBattery");
    }
}
class devices{
    void ring(){
        System.out.println(" devie is  ringing.");
    }
    battery battery(){
        return new battery();
    }
}
class phone extends devices{
    @Override
    void ring() {
        System.out.println("phone is ringing");
    }
    lithiumBattery battery(){
        return new lithiumBattery();
    }
}
class laptop extends devices{
    @Override
    void ring() {
        System.out.println("laptop is ringing");
    }
}
public class polymorphism_Overriding {
    static void main() {
        devices d;
        d = new phone();
        d.ring();
        d = new laptop();
        d.ring();

    }
}
