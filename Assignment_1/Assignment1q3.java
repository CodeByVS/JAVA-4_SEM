import java.util.Scanner;
public class assignment1q3 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks of the student in chemistry out of 100: ");
        marks=sc.nextInt();
        if(marks>=90)
        System.out.println("A- Excellent");
        else if(marks>=80)
        System.out.println("B- very good");
        else if(marks>=70)
        System.out.println("C- good");
        else if(marks>=60)
        System.out.println("D- satisfactory");
        else if(marks>=50)
        System.out.println("E- work hard");
        else if(marks>=40)
        System.out.println("F- just passed");
        else 
        System.out.println("Failed");

        sc.close();
    }
}
