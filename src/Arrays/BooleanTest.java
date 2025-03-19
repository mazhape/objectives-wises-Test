package Arrays;

public class BooleanTest {
    public static void main(String[] args) {
        boolean[] b1 = new boolean[2];
        boolean[] b2 = {true , false};
        System.out.println( "" + (b1[0] == b2[0]) + ", "+ (b1[1] == b2[1])  );
    }
}

//false, true

//Initialization of b1:
//
//boolean[] b1 = new boolean[2]; creates a boolean array b1 of size 2.
//
//In Java, the default value for boolean elements in an array is false.
//
//So, b1 will be initialized as [false, false].
//
//Initialization of b2:
//
//boolean[] b2 = {true, false}; creates a boolean array b2 with explicit values [true, false].
//
//Comparison of Elements:
//
//The expression (b1[0] == b2[0]) compares the first elements of b1 and b2:
//
//b1[0] is false.
//
//b2[0] is true.
//
//false == true evaluates to false.
//The expression (b1[1] == b2[1]) compares the second elements of b1 and b2:
//
//b1[1] is false.
//
//b2[1] is false.
//
//false == false evaluates to true.
//
//Print Statement:
//
//The result of the comparisons is concatenated into a string:
//
//(b1[0] == b2[0]) evaluates to false.
//
//(b1[1] == b2[1]) evaluates to true.
//
//The final string is "false, true".