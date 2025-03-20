package HandlingExceptions;

abstract class Calculator {
    abstract void calculate(); // Abstract method

    public static void main(String[] args) {
        System.out.println("calculating"); // Print a message
        Calculator x = null; // Initialize x to null
        x.calculate(); // Call calculate() on x
    }
}


//It will print calculating and then throw NullPointerException.