package JavaDataTypes;

public class ObjectCreated {
    public static void main(String[] args) {
        public Object getObject(Object a) //0
        {

            Object b = new Object();  // Object@123 created (let's call it OBJ-1)
            Object c, d = new Object();  // Object@456 created (OBJ-2), assigned to `d`; `c` is unassigned (null)
            c = b;  // `c` now points to OBJ-1 (same as `b`) //2
            b = a = null;  // `b` and `a` set to null //3
            return c;  // Returns reference to OBJ-1 //4
        }
    }
}



//Never in this method.

//When Does OBJ-1 Become Eligible for GC?
//After the method returns, the returned reference (c) may or may not be stored by the caller.
//
//If the caller ignores/discards the returned value, OBJ-1 becomes unreachable → eligible for GC.
//
//If the caller stores the returned value (e.g., Object x = getObject(...);), OBJ-1 remains reachable → not eligible for GC yet.
//
//Conclusion:
//The object created at line XXX (OBJ-1) becomes eligible for GC after the method returns, only if the caller does not retain the returned reference.
//Example Scenarios:
//Caller discards the return value:
//getObject(someObj);  // OBJ-1 becomes eligible for GC after this line.
//Caller stores the return value:

//Object ref = getObject(someObj);  // OBJ-1 is NOT eligible for GC (referenced by `ref`).
//Thus, the earliest possible point for GC eligibility is after the method call completes, assuming the returned reference is discarded.