/*Write a program in java having an interface called “Address” with two methods
“getAddress” and “setAddress”. The “Address” interface is implemented by three
concrete classes named “HomeAddress”, “OfficeAddress”, and “SchoolAddress”. Use
dynamic method dispatch concept to override the above mentioned methods and display
the address of home, office, and school accordingly.*/

interface address{
    public abstract void getaddress(String address);
    public abstract void setaddress();
} 

class HomeAddress implements address{
    private String address;
    public HomeAddress (String address){
        this.address=address;
    }

    @Override
    public void getaddress(String address) {
        this.address=address;
    }

    @Override
    public void setaddress() {
        System.out.println("Home address "+address);
    }
}

class SchoolAddress implements address{
    private String address;
    public SchoolAddress(String address) {
        this.address=address;
    }
    @Override
    public void getaddress(String address) {
        this.address=address;
    }
    @Override
    public void setaddress() {
        System.out.println("School Address "+address);
    }
    
}
class OfficeAddress implements address{
    private String address;
    public OfficeAddress(String address) {
        this.address=address;
    }
    @Override
    public void getaddress(String address) {
        this.address=address;
    }
    @Override
    public void setaddress() {
        System.out.println("Office Address "+address);
    }
    
}
public class Q1b {
    public static void main(String[] args) {
        address HA=new HomeAddress("jkdvk");
        HA.setaddress();
        address SA=new SchoolAddress("jkdvk");
        SA.setaddress();
        address OA=new OfficeAddress("jkdvk");
        OA.setaddress();
    }

    
}
