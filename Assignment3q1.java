/*Write a program in java to create a class called Box with three data members
(length, width, height) and a method volume(). Also, implement the
application class Demo, where an object of the box class is created with
user-entered dimensions and prints the volume.
Input: length,width and height.
Output: Volume */

import java.util.Scanner;

class BOX {
    int length;
    int width;
    int height;

    int volume() {
        return (length * width * height);
    }
}

public class Assignment3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BOX b1 = new BOX();
        System.out.println("Enter lenght:");
        b1.length = sc.nextInt();
        System.out.println("Enter width:");
        b1.width = sc.nextInt();
        System.out.println("Enter height:");
        b1.height = sc.nextInt();
        System.out.println(b1.volume());
        sc.close();
    }

}
