package InstanceOfOperator;


interface Flyers{ }
class Birds implements Flyers { }
class Eagles extends Birds { }
class Bats { }

public class TestClassBirds {
    public static void main(String[] args) {
        Flyers f = new Eagles();
        Eagles e = new Eagles();
        Bats b = new Bats();

        if(f instanceof Flyers) System.out.println("f is a Flyers");
        if(e instanceof Birds) System.out.println("e is a Birds");
        if(b instanceof Birds) System.out.println("b is a Birds");
    }
}

//It will not compile.
//b points to an object of class Bat, which does not extend from Bird. Now, it is possible for b to point to an object of any subclass of Bat. However, it is not possible for that sub class to extend Bird (because a class can at most extend from only one class). Therefore, it is not possible for b to point to an object of a class that "is a" Bird. The compiler figures out this fact at compile time itself and so the code fails to compile.