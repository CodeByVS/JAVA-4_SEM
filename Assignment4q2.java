
/*Write a program to Illustrate the execution of constructors in multilevel
inheritance with three Java classes – plate (length, width), box (length, width,
height), woodbox (length, width, height, thick) where box inherits from plate
and woodbox inherits from box class. Each class has a constructor where
dimensions are taken from the user.

Input: Enter the dimensions
Output: Display the dimensions accordingly */

import java.util.Scanner;

class Plate {
    int length, width;

    Plate(Scanner scanner) {
        System.out.print("Enter length: ");
        this.length = scanner.nextInt();
        System.out.print("Enter width: ");
        this.width = scanner.nextInt();

    }
}

class Box extends Plate {
    int height;

    Box(Scanner scanner) {
        super(scanner);
        System.out.print("Enter height: ");
        this.height = scanner.nextInt();

    }
}

class WoodBox extends Box {
    int thick;

    WoodBox(Scanner scanner) {
        super(scanner);
        System.out.print("Enter thickness: ");
        this.thick = scanner.nextInt();

    }
}

public class Assignment4q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Plate plate = new Plate(scanner);
        System.out.println("Plate: length = " + plate.length + ", width = " + plate.width);
        Box box = new Box(scanner);
        System.out.println("Box: length = " + box.length + ", width = " + box.width + ", height = " + box.height);
        WoodBox woodBox = new WoodBox(scanner);
        System.out.println("WoodBox: length = " + woodBox.length + ", width = " + woodBox.width + ", height = "
                + woodBox.height + ", thickness = " + woodBox.thick);
        scanner.close();
    }
}
