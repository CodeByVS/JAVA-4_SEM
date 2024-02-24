/*Define an interface Employee with a method getDetails() to get employee details
as Empid and Ename. Also define a derived interface Manager with a method
getDeptDetails() to get department details such as Deptid and Deptname.Then
define a class Head which implements Manager interface and also prints all
details of the employee. Write the complete program to display all details of one
head of the department.

Input: Enter employee id - 123
Enter employee name - Sidharth Ambani
Enter department id - 06
Enter department name -Marketing
Output: Employee id - 123
Employee name - Sidharth Ambani
Department id - 06
Department name -Marketing */

import java.util.Scanner;

interface Employee{
    public abstract void getDetails(Scanner sc);
}
interface Manager extends Employee{
    public abstract void getDeptDetails(Scanner sc);
}
class Head implements Manager{
    String Ename;
    int Empid;
    public void getDetails(Scanner sc){
        System.out.println("Enter The ID Of Employee:");
        this.Empid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter The NAME Of Employee:");
        this.Ename=sc.nextLine();
    }
    void Outputemp(){
        System.out.println("Employee id - "+ Empid);
        System.out.println("Employee name - "+Ename);
    }
    int departmentid;
    String departmentname; 
    public void getDeptDetails(Scanner sc){
        System.out.println("Enter The ID Of Department:");
        this.departmentid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter The NAME Of Department:");
        this.departmentname=sc.nextLine();
    }
    void Outputm(){
        System.out.println("Department id - "+ departmentid);
        System.out.println("Department name - "+departmentname);
    }
}
public class Assignment5q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Head H = new Head();
        H.getDetails(sc);
        H.getDeptDetails(sc);
        H.Outputemp();
        H.Outputm();
        sc.close();

    }
}
