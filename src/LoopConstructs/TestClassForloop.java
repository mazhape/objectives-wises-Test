package LoopConstructs;

public class TestClassForloop {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=0,j=0;j<i;++j,i++){
            System.out.println(i+""+j);
        }
        System.out.println(i+""+j);
    }
}

//0 0 will be printed once.

//First Iteration (i = 0, j = 0):
//
//Condition Check: j < i → 0 < 0 (false)
//The loop does not execute because the condition j < i is false from the start.
//Post-Loop:
//
//The loop never executes, so the values of i and j remain as initialized (i = 0, j = 0).
//The statement System.out.println(i + " " + j); after the loop prints the final values of i and j, which are 0 and 0 respectively.