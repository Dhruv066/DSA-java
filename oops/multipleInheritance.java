package oops;

import java.util.Scanner;

// in this program multiple inheritance is achieved.

interface printer{
    public void print();

// below given method shows that through multiple inheritance diamond problem is resolved
    public void consumeElectricity();
}
interface scanner{
    public void scan();
    public void consumeElectricity();
}
class mutipurposeMachine implements printer,scanner{
    @Override
    public void print() {
        System.out.println("mutipurposeMachine is printing.");
    }
    @Override
    public void scan() {
        System.out.println("mutipurposeMachine scanner is scanning.");
    }
    @Override
    public void consumeElectricity() {
        System.out.println("mutipurposeMachine is consuming electricity .");
    }
}
public class multipleInheritance {
    static void main() {
        mutipurposeMachine machine  = new mutipurposeMachine();
        machine.print();
        machine.scan();
        machine.consumeElectricity();
    }
}
