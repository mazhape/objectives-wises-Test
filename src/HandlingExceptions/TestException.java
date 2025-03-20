package HandlingExceptions;

class MyException extends Throwable {} // Custom exception
class MyException1 extends MyException {} // Subclass of MyException
class MyException2 extends MyException {} // Subclass of MyException
class MyException3 extends MyException2 {} // Subclass of MyException2
public class TestException {
    void myMethod() throws MyException {
        throw new MyException3(); // Throw MyException3
    }

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest(); // Create an instance of ExceptionTest
        try {
            et.myMethod(); // Call myMethod(), which throws MyException3
        } catch (MyException me) {
            System.out.println("MyException thrown"); // Catch MyException
        } catch (MyException3 me3) {
            System.out.println("MyException3 thrown"); // Catch MyException3
        } finally {
            System.out.println(" Done"); // Execute finally block
        }
    }
}

//

//It fails to compile