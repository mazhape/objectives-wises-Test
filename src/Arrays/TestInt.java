package Arrays;

public class TestInt {
    public static void main(String[ ] args){
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 2, 3, 1, 0 };
        System.out.println( a [ (a = b)[3] ] );
    }
}

//It will print 1

///int[] a = {1, 2, 3, 4}; creates an array a with elements [1,2,3,4].
//
//int[] b = {2, 3, 1, 0}; creates an array b with elements [2, 3, 1, 0].
//
//Expression Evaluation:
//
//The expression a[(a = b)[3]] is evaluated as follows:
//
//(a = b) assigns the array b to the variable a. After this assignment, a now refers to the array [2, 3, 1, 0].
//
//(a = b)[3] accesses the element at index 3 of the array b (which is now also a). The value at index 3 is 0.
//
//The expression simplifies to a[0], where a now refers to the array [2, 3, 1, 0].
//
//a[0] accesses the element at index 0 of the array [2, 3, 1, 0], which is 2.