package Arrays;

class ArrayTest {
    public static void main(String[] args) {
        int ia[][] = { {1, 2}, null };

        for (int i = 0; i < 2; i++) // Outer loop for rows
            for (int j = 0; j < 2; j++) // Inner loop for columns
                System.out.println(ia[i][j]); // Printing array elements
    }
}


//It will throw a NullPointerException at Runtime.

//The ia array is a 2D jagged array, meaning:

//ia[0] = {1, 2};
//ia[1] = null;
//The first iteration (i = 0):
//
//j = 0 → ia[0][0] = 1 (✅ Prints 1)
//j = 1 → ia[0][1] = 2 (✅ Prints 2)
//The second iteration (i = 1):
//
//ia[1] = null, so when it tries to access ia[1][0], it throws a NullPointerException ❌.