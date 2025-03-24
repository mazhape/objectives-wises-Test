package OperatorsandConstructs;

public class ForSwitch {
    public static void main(String args[]){
        char i;
        LOOP: for (i=0;i<5;i++){
            switch(i++){
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                case 2: System.out.println("C"); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E' : System.out.println("F");
            }
        }
    }
}


// C and F


//Step-by-Step Execution:
//Variable Initialization:
//
//char i; → i is a character variable.
//In the loop, i starts from 0 and increments by 1 after each iteration.
//First Iteration (i = 0):
//
//switch (i++): This expression increments i after the switch condition is evaluated, so i becomes 1 after the evaluation.
//Now, switch(0) is evaluated:
//Case '0': '0' corresponds to ASCII value 48, and i is now 1. So, this case is not matched.
//Case 1: This matches i = 1. So, the following statement is executed:

//System.out.println("B");
//break LOOP;: The break LOOP; statement terminates the outer LOOP and exits the for loop.
//Since break LOOP terminates the loop immediately after printing "B", the loop will not continue to the next iterations.