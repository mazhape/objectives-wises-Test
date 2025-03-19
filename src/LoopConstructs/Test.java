package LoopConstructs;

class Test {
    public static void main(String args[]) {
        int c = 0; // Initialize a counter variable 'c' to 0

        // Outer loop labeled 'A'
        A: for (int i = 0; i < 2; i++) {
            // Middle loop labeled 'B'
            B: for (int j = 0; j < 2; j++) {
                // Inner loop labeled 'C'
                C: for (int k = 0; k < 3; k++) {
                    c++; // Increment the counter 'c' by 1 in each iteration of the innermost loop

                    // Check if 'k' is greater than 'j'
                    if (k > j) {
                        break; // If true, break out of the innermost loop (loop 'C')
                    }
                }
            }
        }

        // Print the final value of 'c'
        System.out.println(c);
    }
}

//10

//Iteration 1 (i = 0):
//Middle Loop (j = 0):
//
//Inner Loop (k = 0):
//
//c++ → c = 1.
//
//k > j → 0 > 0 → false (no break).
//
//Inner Loop (k = 1):
//
//c++ → c = 2.
//
//k > j → 1 > 0 → true → break out of loop C.
//
//Middle Loop (j = 1):
//
//Inner Loop (k = 0):
//
//c++ → c = 3.
//
//k > j → 0 > 1 → false (no break).
//
//Inner Loop (k = 1):
//
//c++ → c = 4.
//
//k > j → 1 > 1 → false (no break).
//Inner Loop (k = 2):
//
//c++ → c = 5.
//
//k > j → 2 > 1 → true → break out of loop C.
//
//Iteration 2 (i = 1):
//Middle Loop (j = 0):
//
//Inner Loop (k = 0):
//
//c++ → c = 6.
//
//k > j → 0 > 0 → false (no break).
//
//Inner Loop (k = 1):
//
//c++ → c = 7.
//
//k > j → 1 > 0 → true → break out of loop C.
//
//Middle Loop (j = 1):
//
//Inner Loop (k = 0):
//
//c++ → c = 8.
//k > j → 0 > 1 → false (no break).
//
//Inner Loop (k = 1):
//
//c++ → c = 9.
//
//k > j → 1 > 1 → false (no break).
//
//Inner Loop (k = 2):
//
//c++ → c = 10.
//
//k > j → 2 > 1 → true → break out of loop C.