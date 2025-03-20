package HandlingExceptions;

public class Test {
    static String j = ""; // Static variable to store the result

    public static void method(int i) {
        try {
            if (i == 2) {
                throw new Exception(); // Throw an exception if i == 2
            }
            j += "1"; // Append "1" to j if no exception is thrown
        } catch (Exception e) {
            j += "2"; // Append "2" to j if an exception is caught
            return; // Exit the method
        } finally {
            j += "3"; // Append "3" to j in the finally block
        }
        j += "4"; // Append "4" to j if no exception is thrown and the method doesn't return
    }

    public static void main(String args[]) {
        method(1); // Call method with i = 1
        method(2); // Call method with i = 2
        System.out.println(j); // Print the value of j
    }
}

//13423