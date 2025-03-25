package InstanceOfOperator;

class Aa { }
class Bb extends Aa { }
class Cc extends Bb { }
class Dd extends Cc { }
public class TestClassLetters {
    public static void main(String args[]){
        Bb b = new Cc(); // Object of class C assigned to reference of type B
        Aa a = b;       // Upcasting: B reference assigned to A reference

        if (a instanceof Aa) System.out.println("Aa");
        if (a instanceof Bb) System.out.println("Bb");
        if (a instanceof Cc) System.out.println("Cc");
        if (a instanceof Dd) System.out.println("Dd");
    }
}


//A will be printed.
//B will be printed.
//C will be printed.


//Instance Checks (instanceof)
//
//The instanceof operator checks whether a refers to an instance of the given class or any of its subclasses.
//
//Expression	    Evaluates To	Reason
//a instanceof A	  true	        C is a subclass of A.
//a instanceof B	  true	        C extends B.
//a instanceof C	  true	        a refers to an instance of C.
//a instanceof D	  false	        a refers to a C, but C is not a subclass of D.