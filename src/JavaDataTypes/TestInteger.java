package JavaDataTypes;

public class TestInteger {
    public static void testInts(Integer obj, int var) {
        obj = var++;  // obj is assigned the value of var (var++ does not affect obj)
        obj++;        // obj is incremented but does not affect the original Integer
    }

    public static void main(String[] args) {
        Integer val1 = new Integer(5);  // val1 = 5 (Wrapper object)
        int val2 = 9;                   // val2 = 9 (Primitive int)

        testInts(val1++, ++val2);       // Pass `val1++` (post-increment) and `++val2` (pre-increment)
        System.out.println(val1 + " " + val2);
    }
}


//6 10

//Step 2: Method Call
//testInts(val1++, ++val2);
//val1++ (post-increment):
//
//val1++ passes the current value (5) to the method.
//
//After passing, val1 is incremented to 6.
//
//++val2 (pre-increment):
//
//++val2 increments val2 before passing it, so val2 becomes 10 and 10 is passed.
//
//Thus, testInts(5, 10); is called.
//
//Step 3: Inside testInts
//public static void testInts(Integer obj, int var) {
//    obj = var++;  // obj = 10, var is now 11
//    obj++;        // obj is now 11 (but does not affect the original val1)
//}
//obj = var++; assigns var (which is 10) to obj, and then var increments to 11.
//
//obj++ increments obj to 11, but since obj is a local variable, it does not modify the original val1.
//
//Step 4: Returning to main
//After the method finishes execution:
//
//val1 remains 6 (since val1++ incremented it in main).
//
//val2 is 10 (was incremented before being passed).
//
//Thus, the final output is:

//System.out.println(val1 + " " + val2);
//Prints:
//6 10