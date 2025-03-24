package OperatorsandConstructs;

public class SwitchTest {
    public static void main(String[] args) {
        switch (5) {
            default:
            case 1:
                System.out.println(1);
            case 0:
                System.out.println(0);
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
        }

    }
}


//It will print 1 0 2

//Value of i:
//
//i = 5
//Check for matching case:
//The switch statement checks if i matches any of the case values (1, 0, 2, 3).
//Since i = 5, none of the case values match.
//Execute the default block:
//When no case matches, the default block is executed.
//The default block does not contain any code, so execution falls through to the next case
//Step 2: Fall-Through Behavior
//In Java, if a case block does not end with a break statement, execution will "fall through" to the next case block, regardless of whether the case matches. This behavior continues until a break is encountered or the switch statement ends.
//
//Fall through to case 1:
//
//The default block has no break, so execution falls through to case 1.
//
//System.out.println(1); is executed, printing 1.
//
//Fall through to case 0:
//
//case 1 has no break, so execution falls through to case 0.
//
//System.out.println(0); is executed, printing 0.
//
//Fall through to case 2:
//
//case 0 has no break, so execution falls through to case 2.
//
//System.out.println(2); is executed, printing 2.
//
//The break statement in case 2 terminates the switch statement.
//
//case 3 is not executed:
//
//The break in case 2 prevents execution from reaching case 3.