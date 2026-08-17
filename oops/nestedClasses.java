package oops;
class outer{

    String name= "outer";
    void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
    class inner{

        void m3(){
            System.out.println("inner m3");
            System.out.println(outer.this.name);
        }

    }
    // local inner class
    void functForLocal(){
        class localInner{
            void m4(){
                System.out.println("localInner m4");

            }
        }
    }
}

public class nestedClasses {
    static void main() {
        outer o = new outer();
        o.m1();
        o.m2();
        outer.inner i = o.new inner();
        i.m3();
    }
}
