package OperatorsandConstructs;

public class TestClassArgs {
    public static int m1(int i){
        return ++i;
    }

    public static void main(String[] args) {

        int k = m1(args.length);
        k += 3 + ++k;
        System.out.println(k);
    }
}


//6


//Step 1: Determine args.length
//The program is run without any command-line arguments.
//args is an empty array, so:
//args.length == 0;
//Step 2: Call m1(args.length)

//int k = m1(args.length);
//m1(0) is called.
//Inside m1(int i), ++i increments i from 0 to 1 and returns 1.
//So, k = 1.
//Step 3: Evaluate k += 3 + ++k;
//Current k = 1
//Break down the right-hand side:

//3 + ++k
//++k increments k from 1 to 2, so ++k = 2.
//3 + 2 = 5.

//k = k + 5;
//k = 1 + 5;
//k = 6;
//Step 4: Print Output
//System.out.println(k);
//The final value of k is 6, so the program prints:
//6