package OperatorsandConstructs;

public class TestClassFlag {
    public static void main(String[] args) throws Exception {

        boolean flag  = true;
        switch (flag){
            case true : System.out.println("true");
            default: System.out.println("false");
        }

    }
}


//It will not compile.
//A boolean cannot be used for a switch statement. It needs an integral type, an enum, or a String.

//The code will not compile due to the following reason:
//
//1. switch does not support boolean in Java
//In Java, a switch statement only supports the following data types:
//byte, short, char, int (and their wrapper classes like Byte, Short, Character, Integer)
//String
//enum
//boolean is NOT a valid type for switch.
//A boolean variable can only take two values (true or false), and Java does not allow switching on boolean values because it is unnecessary (an if-else statement is more appropriate).
//2. Compilation Error Message
//If you try to compile the code, you will get an error similar to:

//TestClass.java:6: error: incompatible types: boolean cannot be converted to int
//         switch (flag){
//                 ^
//1 error