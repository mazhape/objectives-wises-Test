package HandlingExceptions;

public class TestFloat {
    public static void main(String[] args) {
        public float parseFloat(String s) {
            float f = 0.0f;
            try {
                f = Float.valueOf(s).floatValue(); // Step 1: Convert String to float
                return f;  // Step 2: Return converted float value
            }
            catch (NumberFormatException nfe) {
                System.out.println("Invalid input " + s);
                f = Float.NaN; // Step 3: Assign NaN if conversion fails
                return f;  // Step 4: Return NaN
            }
            finally {
                System.out.println("finally"); // Step 5: Finally block always executes
            }
            return f;  // This line is unreachable and will cause a compilation error.
        }

    }
}
