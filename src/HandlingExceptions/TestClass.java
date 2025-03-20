package HandlingExceptions;

class MyException extends Exception {}  // Custom checked exception

public class TestClass {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        try {
            tc.m1();  // This will throw MyException
        }
        catch (MyException e) {
            tc.m1();  // This will throw MyException again
        }
        finally {
            tc.m2();  // This will throw NullPointerException
        }
    }

    public void m1() throws MyException {
        throw new MyException();  // Always throws MyException
    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();  // Always throws NullPointerException
    }
}


//It will not compile because of unhandled exception.