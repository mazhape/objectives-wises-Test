package LoopConstructs;

public class TestClassSum {
    public static void main (String args []){
        int sum = 0;
        for (int i = 0, j = 10; sum > 20; ++i, --j)      // 1
        {
            sum = sum+ i + j;
        }
        System.out.println("Sum = " + sum);
    }
}


//Sum = 0

//First Iteration:
//
//Condition Check: sum > 20 → 0 > 20 (false).
//Since the condition sum > 20 is false from the beginning, the body of the loop does not execute.
//Post-Loop:
//
//The sum remains 0 as the loop did not run.
//The System.out.println("Sum = " + sum); statement prints "Sum = 0"