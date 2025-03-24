package OperatorsandConstructs;

public class TestK {
    public static void main(String[] args) {
        int k = 1;
        int[] a = { 1 };

        k += (k = 4) * (k + 2);
        a[0] += (a[0] = 4) * (a[0] + 2);

        System.out.println(k + " , " + a[0]);
    }
}

//25,25

//Step-by-Step Execution
//1. Evaluating k += (k = 4) * (k + 2);
//Initial value: k = 1
//The right-hand side (k = 4) * (k + 2) is evaluated:
//k = 4 (assignment updates k to 4)
//k + 2 = 4 + 2 = 6
//Now, 4 * 6 = 24
//The expression simplifies to:

//k = k + 24; // k = 1 + 24;
//So, k = 25
//        2. Evaluating a[0] += (a[0] = 4) * (a[0] + 2);
//Initial value: a[0] = 1
//The right-hand side (a[0] = 4) * (a[0] + 2) is evaluated:
//a[0] = 4 (assignment updates a[0] to 4)
//a[0] + 2 = 4 + 2 = 6
//Now, 4 * 6 = 24
//The expression simplifies to:
//a[0] = a[0] + 24; // a[0] = 1 + 24;
//So, a[0] = 25
