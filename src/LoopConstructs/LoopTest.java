package LoopConstructs;

public class LoopTest {
    public static void main(String[] args) {
        void crazyLoop() {
            int c = 0; // Initialize variable 'c' to 0
            JACK: while (c < 8) { // Outer loop labeled 'JACK'
                JILL: System.out.println(c); // Print the value of 'c'
                if (c > 3) // Check if 'c' is greater than 3
                    break JACK; // If true, break out of the loop labeled 'JACK'
                else
                    c++; // Otherwise, increment 'c' by 1
            }
        }
    }
}

//It will print numbers from 0 to 4

//Iteration 1 (c = 0):
//Print c → 0.
//
//c > 3 → 0 > 3 → false.
//
//Increment c → c = 1.
//
//Iteration 2 (c = 1):
//Print c → 1.
//
//c > 3 → 1 > 3 → false.
//
//Increment c → c = 2.
//
//Iteration 3 (c = 2):
//Print c → 2.
//
//c > 3 → 2 > 3 → false.
//
//Increment c → c = 3.
//
//Iteration 4 (c = 3):
//Print c → 3.
//c > 3 → 3 > 3 → false.
//
//Increment c → c = 4.
//
//Iteration 5 (c = 4):
//Print c → 4.
//
//c > 3 → 4 > 3 → true.
//
//Execute break JACK; → Exit the loop.
//
//        Output:
//The program will print the values of c from 0 to 4: