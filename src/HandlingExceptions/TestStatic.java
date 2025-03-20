package HandlingExceptions;

public class TestStatic {
    static String s = ""; // Static variable to store the result

    public static void m0(int a, int b) {
        s += a; // Append the value of 'a' to 's'
        m2();   // Call m2(), which throws an exception
        m1(b);  // This line is never reached because m2() throws an exception
    }

    public static void m1(int i) {
        s += i; // Append the value of 'i' to 's'
    }

    public static void m2() {
        throw new NullPointerException("aa"); // Throw a NullPointerException
    }

    public static void m() {
        m0(1, 2); // Call m0(1, 2)
        m1(3);    // This line is never reached because m0() throws an exception
    }

    public static void main(String args[]) {
        try {
            m(); // Call m()
        } catch (Exception e) {
            // Catch any exception thrown by m()
        }
        System.out.println(s); // Print the value of 's'
    }
}


//1


//Initialization:
//
//static String s = ""; initializes the static variable s to an empty string.
//
//Call to m() in main:
//
//The main method calls m() inside a try-catch block.
//
//Execution of m():
//
//m() calls m0(1, 2).
//
//Execution of m0(1, 2):
//
//s += a; appends the value of a (which is 1) to s. Now, s = "1".
//
//m2(); is called.
//
//Execution of m2():
//
//m2() throws a NullPointerException("aa").
//
//The exception propagates up the call stack, and the m0(1, 2) method is exited abruptly.
//
//The line m1(b); in m0(1, 2) is not executed.
//
//Exception Handling in main:
//
//The NullPointerException thrown by m2() is caught in the catch block of the main method.
//
//The exception is ignored, and the program continues.
//
//Print Statement in main:
//
//The value of s is printed. At this point, s = "1".
//
//Final Value of s:
//After the execution of the program, the value of s is:
//
//Copy
//1
//Output:
//The program will print:
//
//Copy
//1
//Key Points:
//Exception Propagation:
//
//When m2() throws a NullPointerException, the exception propagates up the call stack.
//
//The m0(1, 2) method is exited abruptly, and the remaining code in m0(1, 2) (i.e., m1(b)) is not executed.
//
//Exception Handling:
//
//The catch block in the main method catches the NullPointerException and prevents the program from crashing.
//
//However, the exception is ignored, and the program continues execution.
//
//String Concatenation:
//
//The += operator appends the value of a (which is 1) to s before the exception is thrown.
//
//Summary:
//The program appends "1" to s before the exception is thrown.
//
//The exception is caught and ignored, and the program prints the value of s, which is "1".
//
//The output of the program is:1
