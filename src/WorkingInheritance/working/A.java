package WorkingInheritance.working;

class A{
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        a = b;  // 1
        b = a;  // 2
        a = (B) b; // 3
        b = (B) a; // 4
    }
}
class B extends A { }


//b = a;  // Line 2
//Because 'a' is declared of class A and 'b' is of B which is a subclass of A. So an explicit cast is needed.
//Because Java does not allow implicit downcasting from a parent class (A) to a child class (B).