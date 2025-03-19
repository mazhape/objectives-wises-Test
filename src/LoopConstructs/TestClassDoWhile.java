package LoopConstructs;

public class TestClassDoWhile {
    public static void main(String[] args){
        int k = 2; // Initialize k to 2
        do {
            System.out.println(k); // Print the value of k
        } while (--k > 0); // Decrement k and check if it's greater than 0
    }
}


//2 1

//Initialization: k is initialized to 2.
//
//First Iteration:
//
//The do block is executed:
//
//System.out.println(k); prints the value of k, which is 2.
//
//The while condition is evaluated:
//
//--k decrements k to 1.
//
//The condition 1 > 0 is true, so the loop continues.
//
//Second Iteration:
//
//The do block is executed again:
//
//System.out.println(k); prints the value of k, which is now 1.
//
//The while condition is evaluated:
//
//--k decrements k to 0.
//
//The condition 0 > 0 is false, so the loop terminates.