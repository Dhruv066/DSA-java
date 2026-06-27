import java.util.Scanner;

public class checkQuadrant {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x coordinate :");
        int x = sc.nextInt();
        System.out.println("enter the y coordinate :");
        int y = sc.nextInt();
        if (x==0 && y==0){
            System.out.println("Origin");
        }else if(x==0 ){
            System.out.println("On Y axis");
        }else if(y==0){
            System.out.println("On X axis");
        }else if(x > 0 && y > 0){
            System.out.println(" In first Quadrant");
        }else if(x < 0 && y > 0){
            System.out.println(" In second Quadrant");
        }else if(x < 0 && y < 0){
            System.out.println(" In third Quadrant");
        }else if(x > 0 && y < 0){
            System.out.println(" In fourth Quadrant");
        }
    }
}
