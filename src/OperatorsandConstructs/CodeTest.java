package OperatorsandConstructs;

public class CodeTest {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        if( (i++ == 0) & (j++ == 2) ){
            i = 12;
        }
        System.out.println(i+" "+j);

    }
}


//1 2


//i is initialized to 0
//
//j is initialized to 1
//
//Condition Evaluation:

//if( (i++ == 0) & (j++ == 2) )
//First part: (i++ == 0)
//
//i++ evaluates to 0 (since i is initially 0).
//
//The comparison 0 == 0 returns true.
//
//i is then incremented to 1.
//
//Second part: (j++ == 2)
//
//j++ evaluates to 1 (since j is initially 1).
//
//The comparison 1 == 2 returns false.
//
//j is then incremented to 2.
//
//Bitwise AND (&) is used, NOT logical AND (&&):
//
//Since & does not short-circuit, both expressions are evaluated.
//
//true & false results in false, so the if block does not execute.
//
//Final Values:
//
//i remains 1 (not updated to 12 because the if block did not execute).
//
//j is 2.
//
//Print Statement:

//System.out.println(i+" "+j);
//Prints: 1 2