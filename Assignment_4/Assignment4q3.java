
/*Write a program in Java having three classes Apple, Banana and Cherry. Class
Banana and Cherry are inherited from class Apple and each class has their own
member function show() . Using the Dynamic Method Dispatch concept displays
all the show() method of each class.

Input: Mention show function of each class.
Output: Display show function of each class accordingly. */



class Apple {
    public void show() {
        System.out.println("Apple.");
    }

}

class Banana extends Apple {
    public void show() {
        System.out.println("Banana.");
    }

}

class Cherry extends Apple {

    public void show() {
        System.out.println("Cherry.");
    }

}

public class Assignment4q3 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple banana = new Banana();
        Apple cherry=new Cherry();

        apple.show();
        banana.show();
        cherry.show();
        

    }
}
