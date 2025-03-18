package WorkingInheritance.working;


class A implements Runnable{ ...}//A instances can be cast to Runnable.
class B extends WorkingInheritance.working.A implements Observer { ...}//B instances can be cast to both Runnable and Observer.
public class Test2 {
    public static void main(String[] args) {
        WorkingInheritance.working.A a = new WorkingInheritance.working.A() ;
        WorkingInheritance.working.B b = new WorkingInheritance.working.B();
    }
}

//Object o = a; Runnable r = (Runnable) o;
//Object o = b; Runnable r = (Runnable) b;

//Casting to an interface works only if the object actually implements that interface.
//Polymorphism allows casting B to Runnable because B inherits from A, which implements Runnable.
//Casting A to Observer fails because A does not implement Observer