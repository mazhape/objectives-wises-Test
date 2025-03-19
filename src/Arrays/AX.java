package Arrays;

class AX {
    static int[] x = new int[0]; // Static array of size 0
    static {
        x[0] = 10; // Attempt to assign a value to x[0]
    }
    public static void main(String[] args) {
        AX ax = new AX(); // Create an instance of AX
    }
}

