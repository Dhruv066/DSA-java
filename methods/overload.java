package methods;

public class overload {
    public static int add(int a,int b){
        return a+b;
    }
    public float add(float a,float b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static int  add(int a,int b,int c){
        return a+b+c;
    }
    public  static void main(String args[]){
        System.out.println(add(2,9));
        System.out.print(add(2,9,5));
    }
}
