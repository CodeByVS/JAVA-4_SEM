/*Define an interface with three methods – earnings(), deductions() and bonus() and
define a Java class ‘Manager’ which uses this interface without implementing
bonus() method. Also define another Java class ‘Substaff’ which extends from
‘Manager’ class and implements bonus() method. Write the complete program to
find out earnings, deduction and bonus of a sbstaff with basic salary amount
entered by the user as per the following guidelines –
earnings = basic + DA (80% of basic) + HRA (15% of basic)
deduction PF = 12% of basic
bonus = 50% of basic

Input: Basic salary - 50000
Output: Earnings - 97500
Deduction -6000
Bonus - 25000 */

import java.util.Scanner;

interface A{
    public abstract void earnings(Scanner sc);
    public abstract void deductions();
    public abstract void bonus();
}
abstract class Manager implements A {
    double earnings;
    double deduction;
    double bonus;
    int basic;
    double DA=0.80;
    double HRA=0.15;

    public void earnings(Scanner sc) {
        System.out.println("Enter Basic Salary:");
        this.basic=sc.nextInt();
        this.earnings = this.basic + (this.basic * DA) + (this.basic * HRA);
    }
    public void deductions() {
        this.deduction = (this.basic * 0.12);
    }

    
}


class Substaff extends Manager {
    public void bonus() {
        this.bonus = (this.basic * 0.50);
    }
    public void Output() {
        System.out.println("Earnings: " + earnings);
        System.out.println("Deduction: " + deduction);
        System.out.println("Bonus: " + bonus);
    }

}

public class Assignment5q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Substaff mm = new Substaff();
        mm.earnings(sc);
        mm.deductions();
        mm.bonus();
        mm.Output();
    }

}
