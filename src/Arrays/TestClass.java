package Arrays;

class A { }
class B extends A { }

public class TestClass {
    public static void main(String args[]) {
        A[] a, a1;
        B[] b;
        a = new A[10];
        a1 = a;
        b = new B[20];

        a = b;  // 1 ✅ Legal, B[] is a subtype of A[]
        b = (B[]) a;  // 2 ✅ Legal at compile-time, but may cause ClassCastException at runtime
        b = (B[]) a1; // 3 ❌ Throws ClassCastException at runtime
    }
}


//The cast at line 2 is needed
//The program will throw a java.lang.ClassCastException at the line labelled 3 when run.


//Line 1: a = b; ✅
//
//This is valid because B[] (array of subclass B) can be assigned to A[] (array of superclass A).
//Arrays in Java are covariant, meaning B[] can be assigned to A[].
//Line 2: b = (B[]) a; ✅ (Compiles, but risky)
//
//a now refers to a B[] array (from a = b in Line 1).
//A cast is required to assign it back to B[], but it works fine at runtime since a actually refers to a B[] instance.
//Line 3: b = (B[]) a1; ❌ (Throws ClassCastException)
//
//a1 originally pointed to an A[] (new A[10]).
//A[] is not necessarily an array of B, so forcing this cast fails at runtime.Compile time error at line 3.