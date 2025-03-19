package LoopConstructs;

public class TestClassLooper {
    int x = 5; // Instance variable
    int getX() { return x; } // Method to return the value of x

    public static void main(String args[]) throws Exception{
        TestClassLooper tc = new TestClassLooper();// Create an instance of TestClass
        tc.looper(); // Call the looper method
        System.out.println(tc.x); // Print the value of the instance variable x
    }

    public void looper(){
        int x = 0; // Local variable x
        while ((x = getX()) != 0) { // Assign the value of getX() to x and check if it is not 0
            for (int m = 10; m >= 0; m--) { // Inner loop
                x = m; // Assign the value of m to the local variable x
            }
        }

    }
}


//None of these.
//This program will compile and run but will never terminate.

//Explanation:
//The while loop condition (x = getX()) != 0 always evaluates to true because getX() always returns 5.
//
//The inner for loop modifies the local variable x, but this does not affect the instance variable x.
//
//Since the instance variable x is never modified, the while loop condition remains true, causing an infinite loop.