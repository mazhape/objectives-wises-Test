package WorkingInheritance.inheritance;

class Ac{
    public Ac() {} // A1
    public Ac(String s) {  this();  System.out.println("Ac :"+s);  }  // A2
}

class Bc extends Ac{
    public int Bc(String s) {  System.out.println("Bc :"+s);  return 0; } // B1
}
public class CC extends Bc{
    private CC(){ super(); } // C1
    public CC(String s){  this();  System.out.println("CC :"+s);  } // C2
    public CC(int i){} // C3
}


//At least one of the constructors of each class is called as a result of constructing an object of class C.
//To create any object one and only one constructor of that class and each of the super classes is called. (A constructor may as well delegate the construction to another constructor of the same class by calling this(...) as the first statement, just like calling a method.)

//Constructor at  //A2 will never be called in creation of an object of class C.
//Because B has no defined constructor and so a default no-argument constructor will be called, which will call the no-argument constructor of A

//Class C can be instantiated only in two ways by users of class C.
//Since one constructor is private, users of this class can use only the other two public constructors from outside this class.

////B1 will never be called in creation of objects of class A, B, or C.
//Because //B1 is not a constructor. Note that it is returning an int. A constructor does not have any return type, not even void.