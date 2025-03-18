package WorkingInheritance.inheritance;

class Bl {}
class Bl1 extends Bl {}
class Bl2 extends B {}
public class ExtendsTest{
    public static void main(String args[]){
        Bl b = new Bl();
        Bl1 b1 = new Bl1();
        Bl2 b2 = new Bl2();
        // insert statement here
          b = b1;
          b1 = (Bl1) b;



    }
}

//b1 = (B1) b;  // Causes ClassCastException at runtime