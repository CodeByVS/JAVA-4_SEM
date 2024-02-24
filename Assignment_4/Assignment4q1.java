
/*A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
box. The cost of a sheet is Rs 40/- per square ft. and the cost of a box is Rs
60/- per cubic ft. Implement it in Java to calculate the cost of plastic as per the
dimensions given by the user where 3D inherits from 2D.
Input: Enter dimensions
Output: Display the cost of plastic */

import java.util.Scanner;

class BOX2D {
    int price = 40;
    int size;

    BOX2D(int size) {
        this.size = size;
    }

    int getCost() {
        return price * size;
    }
}

class BOX3D extends BOX2D {
    int price = 60;

    BOX3D(int size) {
        super(size);
    }

    int getCost() {
        return price * size;
    }
}

public class Assignment4q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size you need");
        int size;
        size = sc.nextInt();
        BOX2D box = new BOX2D(size);
        System.out.println("COST FOR 2D BOX : " + box.getCost());
        BOX3D box1 = new BOX3D(size);
        System.out.println("COST FOR 3D BOX : " + box1.getCost());
        sc.close();

    }
}
