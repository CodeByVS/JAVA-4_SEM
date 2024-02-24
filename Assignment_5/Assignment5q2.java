/*Write Define an interface Motor with a data member–”capacity” and two
methods such as run() and consume(). Define a Java class ‘Washing machine’
which implements this interface and write the code to check the value of the
interface data member through an object of the class.
Input: mentioned in the program
Output: Capacity of the motor is ----- */

interface A{
    public abstract void run();
    public abstract void consume();
}
abstract class Motor implements A{
    int Capacity;
    public void run() {
        System.out.println("Motor is running");
    }
    public void consume(){
        System.out.println("Motor is consuming power");
    }
}
class Washing_machine extends Motor{
    public void WashingMachine(int Capacity) {
        this.Capacity = Capacity;
      }
    public void out(){
        System.out.println("Capacity of the motor is " +Capacity);
    }
}


public class Assignment5q2 {
    public static void main(String[] args) {
        Washing_machine wm=new Washing_machine();
        wm.WashingMachine(1000);
        wm.run();
        wm.consume();
        wm.out();
    }
}
