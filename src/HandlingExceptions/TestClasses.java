package HandlingExceptions;

public class TestClasses {
    public static void main(String args[]) {
        try {
            RuntimeException re = null; // Step 1: Declare and initialize `re` to null
            throw re; // Step 2: Attempt to throw `null`
        }
        catch(Exception e) { // Step 3: Catch any exception
            System.out.println(e);
        }
    }
}

//