package LoopConstructs;

package loops;
public class JustLooping {
    private int j;  // Instance variable j (default value is 0)

    void showJ() {
        while (j <= 5) {   // Instance variable j is 0 initially
            for (int j = 1; j <= 5;) {  // This declares a new local variable j (different from instance variable j)
                System.out.print(j + " ");
                j++;  // Increments local j
            }
            j++;  // Increments instance variable j
        }
    }

    public static void main(String[] args) {
        new JustLooping().showJ();
    }
}


//It will print 1 2 3 4 5 six times.