package WorkingInheritance.working;

public class SubClass extends SuperClass {
    int i, j, k;

    public SubClass(int m, int n) {
        i = m;
        j = m;
    } // (1) No explicit super() call

    public SubClass(int m) {
        super(m);  // (2) Explicitly calls SuperClass(int)
    }
}


//public SuperClass(int a)
//Because it is called in the second constructor of SubClass.

//public SuperClass()
//The default no args constructor will not be provided because SuperClass has to define one arg constructor.