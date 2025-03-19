package LoopConstructs;

public class SimpleLoop {
    public static void main(String[] args) {
        int i = 0, j = 10;
        int count = 0;
        while (i < j) {
            i++;   // Increment i
            j--;   // Decrement j
            count++; // Increment count
        }
        System.out.println(i + " " + j + " " + count);
    }
}


//5 5 5


//Initial Values:

//i = 0
//j = 10
//count = 0
//Loop Condition: while (i < j), i.e., as long as i is less than j, execute the loop.
//
//Iteration	        Before Loop	     After i++	   After j--	After count++
//1	                 i=0, j=10	        i=1	         j=9	      count=1
//2	                 i=1, j=9	        i=2	         j=8	      count=2
//3	                 i=2, j=8	        i=3	         j=7          count=3
//4	                 i=3, j=7	        i=4	         j=6	      count=4
//5	                 i=4, j=6	        i=5	         j=5	      count=5

//At this point, i == j == 5, so the condition i < j is false, and the loop terminates.