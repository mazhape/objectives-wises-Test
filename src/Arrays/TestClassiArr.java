package Arrays;

public class TestClassiArr {
    public static void main(String args[]) {
        int i = 1; // Primitive variable
        int[] iArr = {1}; // Array with one element
        incr(i); // Call incr with primitive
        incr(iArr); // Call incr with array
        System.out.println("i = " + i + "  iArr[0] = " + iArr[0]);
    }

    public static void incr(int n) { n++; } // Increment primitive
    public static void incr(int[] n) { n[0]++; } // Increment array element
}

//i = 1  iArr[0] = 2