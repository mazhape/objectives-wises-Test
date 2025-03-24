package OperatorsandConstructs;

public class Operators {

    public static int operators() {
        int x1 = -4;
        int x2 = x1--; // Assigns x1 to x2, then decrements x1
        int x3 = ++x2; // Increments x2 first, then assigns to x3

        if (x2 > x3) {
            --x3;
        } else {
            x1++;
        }
        return x1 + x2 + x3;
    }

    public static void main(String[] args) {
        System.out.println(operators());
    }
}



// -10

//int x2 = x1--;
//x1-- is a post-decrement:
//First, x1 is assigned to x2: x2 = -4
//Then, x1 is decremented: x1 = -5
//Values after execution:
//x1 = -5, x2 = -4
//int x3 = ++x2;
//++x2 is a pre-increment:
//x2 is incremented first: x2 = -3
//Then, it is assigned to x3: x3 = -3
//Values after execution:

//x1 = -5, x2 = -3, x3 = -3
//if (x2 > x3) {
//    --x3;
//} else {
//    x1++;
//}
//Condition: x2 > x3
//-3 > -3  (false)
//Since the condition is false, the else block executes:

//x1++;
//x1 = -5 + 1 = -4
//Values after execution:

//x1 = -4, x2 = -3, x3 = -3
//5. Computing return x1 + x2 + x3;
//return x1 + x2 + x3;
//-4 + (-3) + (-3) = -10
