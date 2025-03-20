package HandlingExceptions;

class Base {
    void method1() throws java.io.IOException, NullPointerException {
        someMethod("arguments"); // Calls someMethod, which might throw NullPointerException
        // some I/O operations (which might throw IOException)
    }

    int someMethod(String str) {
        if (str == null) throw new NullPointerException(); // Unchecked exception
        else return str.length();
    }
}

public class NewBase extends Base {
    void method1() { // Overriding method1
        someMethod("args"); // Calls someMethod
    }
}




//