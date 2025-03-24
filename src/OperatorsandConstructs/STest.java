package OperatorsandConstructs;

public class STest {
    public static void main(String args[]) {
        int k = 9, s = 5;
        switch(k) {
            default:
                if (k == 10) {
                    s = s * 2;
                } else {
                    s = s + 4;
                    break;
                }
            case 7:
                s = s + 3;
        }
        System.out.println(s);
    }
}


//9
//Since 9 does not match any of the case labels, it is accepted by default block. In this block, the else part is executed, which sets s to the value of s+4, i.e. 9. Since there is a break in the else block, case 7: is not executed.


//Step-by-Step Execution
//1. Evaluating switch(k)
//The value of k is 9, and there is no case 9.
//Since no matching case exists, execution falls into default.
//2. Execution of default case
//Inside default, we check:
//if (k == 10) {
//    s = s * 2;
//}

//Since k = 9, this condition is false, so the else block executes.
//else block executes:
//s = s + 4; // s = 5 + 4 = 9
//break;
//s is now 9.
//The break terminates the switch statement, so execution exits the switch block.
//3. Execution Continues After swit
//s 9