package oops;

class Engine{
    void run(){
        System.out.println("engine is running.. ");


    }
}
class Truck{
    private Engine engine ;
    Truck(){
        engine = new Engine();
    }

    void start(){
        System.out.println("truck is starting. ");
    }

}