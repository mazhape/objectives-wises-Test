package LoopConstructs;

public class LoopTestClass {
    public static void main(String args[]) {
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) { // i = 0, 1, 2
            middle:
            for (int j = 0; j < 3; j++) { // j = 0, 1, 2
                inner:
                for (int k = 0; k < 3; k++) { // k = 0, 1, 2
                    if (k - j > 0) { // When k > j, break middle loop
                        break middle;
                    }
                    counter++; // Increment counter if not breaking
                }
            }
        }
        System.out.println(counter);
    }
}



//

//i = 0
//
//j = 0
//k = 0 → 0 - 0 == 0 (Not breaking) → counter = 1
//k = 1 → 1 - 0 == 1 (Break middle loop)
//j = 1 (Skipped because of break middle)
//j = 2 (Skipped because of break middle)
//i = 1
//
//j = 0
//k = 0 → 0 - 0 == 0 (Not breaking) → counter = 2
//k = 1 → 1 - 0 == 1 (Break middle loop)
//j = 1 (Skipped because of break middle)
//j = 2 (Skipped because of break middle)
//i = 2
//
//j = 0
//k = 0 → 0 - 0 == 0 (Not breaking) → counter = 3
//k = 1 → 1 - 0 == 1 (Break middle loop)
//j = 1 (Skipped because of break middle)
//j = 2 (Skipped because of break middle)
