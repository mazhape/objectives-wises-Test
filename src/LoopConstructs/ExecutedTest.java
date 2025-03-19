package LoopConstructs;

public class ExecutedTest {
    public static void main(String[] args) throws Exception{
        int i = 1, j = 10;
        do {
            if (i++ > --j) continue;
        } while (i < 5);
        System.out.println("i=" + i + " j=" + j);
    }
}



//i=5 j=6

//The do-while loop will run until i < 5 becomes false.
//
//1st Iteration (i = 1, j = 10)
//i++ > --j → 1 > 9 → false
//i is now 2, j is now 9
//Loop continues (not skipped by continue)
//2nd Iteration (i = 2, j = 9)
//i++ > --j → 2 > 8 → false
//i is now 3, j is now 8
//Loop continues
//3rd Iteration (i = 3, j = 8)
//i++ > --j → 3 > 7 → false
//i is now 4, j is now 7
//Loop continues
//4th Iteration (i = 4, j = 7)
//i++ > --j → 4 > 6 → false
//i is now 5, j is now 6
//Loop stops because i < 5 is now false.