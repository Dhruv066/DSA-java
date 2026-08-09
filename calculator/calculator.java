package calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    static void main() {
        do{
            calculator obj = new calculator();
            System.out.println("Enter 1st number: ");
            float n1 = obj.getOperand();
            char op = obj.getOperator();
            if(op=='?'){
                System.out.println("Invalid operator.");
            }
            System.out.println("Enter 2nd number: ");
            float n2 = obj.getOperand();
            if(!obj.isOperandvalid(op,n2)){
                System.out.println("denominator cant be zero");
                return;
            }

            obj.calculate(op,n1,n2);
            if(obj.isExit()){
                break;
            }
        }while(true);


    }
    public boolean isExit(){
        System.out.println("Would you like to continue - Y/N ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        if(userInput.equals("Y") || userInput.equals("y")){
            return false;
        }
        return true;
    }
    public float getOperand(){
        Scanner sc = new Scanner(System.in);
        float n=sc.nextFloat();
        return n;
    }
    public char getOperator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your operator: ");
        char op = sc.next().charAt(0);
        if(isValidOperator(op)){
            return op;
        }else{
            return '?';
        }
    }
    public boolean isValidOperator(char op){
        if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
            return true;
        }
        return false;
    }
    public boolean isOperandvalid(char op,float n2){
        if (op =='/'|| op=='%'){
            if(n2==0){
                return false;
            }
        }
        return true;
    }
    public void calculate(char op,float n1,float n2){
        switch(op){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            case '%':
                System.out.println(n1%n2);
                break;
            default:
                System.out.println("Invalid operator.");

        }
    }

}
