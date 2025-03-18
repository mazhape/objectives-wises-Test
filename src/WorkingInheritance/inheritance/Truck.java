package WorkingInheritance.inheritance;

class Automobile{
    public void drive() {
        System.out.println("Automobile: drive");
    }
}

public class Truck extends Automobile{
    public void drive() {  System.out.println("Truck: drive");   }
    public static void main (String args [ ]){
        Automobile  a = new Automobile();
        Truck t  = new Truck();
        a.drive(); //1 Automobile: drive
        t.drive(); //2 Truck: drive
        a = t;     //3 Truck: drive
        a.drive(); //4 Truck: drive
    }
}

//It will print:
//Automobile: drive
//Truck: drive
//Truck: drive
//in that order
