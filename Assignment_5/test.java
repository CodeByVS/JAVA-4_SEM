import java.util.Scanner;
abstract class BankAccount{
    int moneydeposit;
    int moneywithdraw;
    int balance;
    int valid;
    public void deposit(Scanner sc){
        System.out.println("Enter the deposit amount:");
        this.moneydeposit=sc.nextInt();
    }
    public void withdraw(Scanner sc){
        System.out.println("Enter the withdraw amount:");
        this.moneywithdraw=sc.nextInt();
    }
    public void getbalance(){
        this.balance=this.moneydeposit-this.moneywithdraw;
    }
    abstract void OutputC();
}

class SavingAccount extends BankAccount{
    void OutputS(){
        System.out.println("This Account is Saving Account");
    }

    @Override
    void OutputC() {
    }
}

class CheckingAccount extends SavingAccount {
    // public void deposit(Scanner sc){
    //     System.out.println("Enter 1 if form is correct or Enter 0 if wrong:");
    //     valid=sc.nextInt();
    // }
    void OutputC(){
        System.out.println("Deposit Amount is"+moneydeposit);
        System.out.println("Withdraw Amount is "+moneywithdraw);
        System.out.println("Balance Amount is "+balance);
    }
}
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount BA=new CheckingAccount();
        BA.deposit(sc);
        BA.withdraw(sc);
        BA.getbalance();
        BA.OutputC();
    }
}
