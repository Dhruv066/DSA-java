package oops;
class bankAccount{
    private int accountNumber;
    private double balance;
    bankAccount(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("deposited "+amount);
        }else {
            System.out.println("invalid deposit ammount");
        }
    }
    public void withdraw(double amount){
        if (amount>0&& amount<=balance){
            this.balance -= amount;
        }else{
            System.out.println("Insufficient funds");
        }
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
}
public class encapsulationDemo {
    public static void main() {
        bankAccount bankAccount = new bankAccount(1,100.0);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(10);
        bankAccount.withdraw(5);
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(500);

    }

}
