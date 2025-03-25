package InstanceOfOperator;

interface Flyer{ }
class Bird implements Flyer { }
class Eagle extends Bird { }
class Bat { }
public class TestClassFlyer {
    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();

        if(f instanceof Bird) System.out.println("f is a Bird");
        if(e instanceof Flyer) System.out.println("e is a Flyer");
        if(b instanceof Flyer) System.out.println("b is a Flyer");
    }
}


////f is a Bird
////e is a Flyer
////At run time, f points to an object of class Eagle. Now, Eagle extends Bird so f instanceof Bird returns true.
////e points to an object of class Eagle. Eagle extends Bird, which in turn implements Flyer. So an Eagle is a Flyer. Therefore, e instanceof Flyer will also return true.
////
////b points to an object of class Bat, which does not extend from Bird. Therefore, b instanceof Flyer returns false.