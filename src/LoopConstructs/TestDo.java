package LoopConstructs;

public class TestDo {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        do {
            if (count % 3 == 0) continue;
            sum += count;
        } while (count++ < 11);
        System.out.println(sum);
    }
}

//48


//Step-by-step Execution:
//Initialization:
//
//count = 0
//sum = 0
//Loop Execution (do-while):
//
//do {} ensures at least one execution before checking while(count++ < 11).
//First Iteration (count = 0):
//if (0 % 3 == 0) → true
//continue; is executed → skips sum += count;
//count++ → 1
//Second Iteration (count = 1):
//if (1 % 3 == 0) → false
//sum += 1 → sum = 1
//count++ → 2
//Third Iteration (count = 2):
//if (2 % 3 == 0) → false
//sum += 2 → sum = 3
//count++ → 3
//Fourth Iteration (count = 3):
//if (3 % 3 == 0) → true
//continue; is executed → skips sum += count;
//count++ → 4
//Fifth Iteration (count = 4):
//if (4 % 3 == 0) → false
//sum += 4 → sum = 7
//count++ → 5
//Sixth Iteration (count = 5):
//if (5 % 3 == 0) → false
//sum += 5 → sum = 12
//count++ → 6
//Seventh Iteration (count = 6):
//if (6 % 3 == 0) → true
//continue; is executed → skips sum += count;
//count++ → 7
//Eighth Iteration (count = 7):
//if (7 % 3 == 0) → false
//sum += 7 → sum = 19
//count++ → 8
//Ninth Iteration (count = 8):
//if (8 % 3 == 0) → false
//sum += 8 → sum = 27
//count++ → 9
//Tenth Iteration (count = 9):
//if (9 % 3 == 0) → true
//continue; is executed → skips sum += count;
//count++ → 10
//Eleventh Iteration (count = 10):
//if (10 % 3 == 0) → false
//sum += 10 → sum = 37
//count++ → 11
//Twelfth Iteration (count = 11):
//if (11 % 3 == 0) → false
//sum += 11 → sum = 48
//count++ → 12
//Exit condition count++ < 11 fails