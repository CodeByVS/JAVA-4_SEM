/*Implement a class “CPU” having private data members “manufacturer” of String data type &
“price” of double data type, and two inner classes “Processor” and “RAM”. “Processor” class has
private data members “numcores” of int data type & “manufacturer” of String data type, and
private methods “getCache” and “setCache”. “RAM” class has private data members “memory”
of double data type & “manufacturer” of String data type, and private methods “getClockSpeed”
and “setClockSpeed”. Finally, implement a driver class “Main” to create a “CPU” object and
display all the details of that object in the user console. */

class CPU {
    private String manufacturer;
    private double price;

    public CPU(String manufacturer, double price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    class Processor {
        private int numCores;
        private String manufacturer;

        public Processor(int numCores, String manufacturer) {
            this.numCores = numCores;
            this.manufacturer = manufacturer;
        }

        public int getNumCores() {
            return numCores;
        }

        public void setNumCores(int numCores) {
            this.numCores = numCores;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public void getCache() {
            System.out.println("Cache information not implemented yet.");
        }

        public void setCache(int cacheSize) {
            System.out.println("Cache setting not implemented yet.");
        }
    }

    class ram {
        private double memory;
        private String manufacturer;

        public ram(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public double getMemory() {
            return memory;
        }

        public void setMemory(double memory) {
            this.memory = memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public void getClockSpeed() {
            System.out.println("Clock speed information not implemented yet.");
        }

        public void setClockSpeed(int clockSpeed) {
            System.out.println("Clock speed setting not implemented yet.");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        CPU c=new CPU("Ravi", 1000);
        System.out.println(c.getManufacturer());
        System.out.println(c.getPrice());
        CPU.Processor p= c.new Processor(8, "AMD");
        System.out.println(p.getManufacturer());
        System.out.println(p.getNumCores());
        p.getCache();
        p.setCache(20);
        CPU.ram r=c.new ram(500, "Ram");
        System.out.println(r.getMemory());
        System.out.println(r.getManufacturer());
        r.getClockSpeed();
        r.setClockSpeed(20);


    }

}
