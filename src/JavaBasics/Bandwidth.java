package JavaBasics;

class User{
    Bandwidth bw = new Bandwidth();

    public void consume(int bytesUsed){
        bw.addUsage(bytesUsed);
    }
  // ... other irrelevant code
}

public class Bandwidth {
    private int totalUsage;
    private double totalBill;
    private double costPerByte;

    //add your code here

    //... other irrelevent code
}
