package HandlingExceptions;

public class FloatTest {
    public static void main(String[] args) {
        Float f = null;
        try {
            f = Float.valueOf("12.3");  // Step 1: Convert String "12.3" to a Float object
            String s = f.toString();    // Step 2: Convert Float to String → "12.3"
            int i = Integer.parseInt(s); // Step 3: Attempt to parse "12.3" as an Integer
            System.out.println("" + i);  // Step 4: Print the integer value
        }
        catch (Exception e) {
            System.out.println("trouble : " + f);
        }

    }
}


//trouble : 12.3