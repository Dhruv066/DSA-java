package oops;
interface payment{
//    we cannot create the constructor of the interfaces
    void pay();
}
class upiPayment implements payment{
    @Override
    public void pay() {
        System.out.println("payed using upi");
    }
}
class creditCardPayment implements payment{
    @Override
    public void pay() {
        System.out.println("payed using credit card");
    }
}
public class interfaces {
    static void main() {
        payment p1 = new upiPayment();
        payment p2 = new creditCardPayment();
        p1.pay();
        p2.pay();

    }
}
