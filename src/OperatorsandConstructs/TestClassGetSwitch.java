package OperatorsandConstructs;

public class TestClassGetSwitch {
    public static int
    getSwitch(int x){
        return x - 20/x + x*x;
    }
    public static void main(String args[]) {
        switch (getSwitch(10)) {
            case 1:
            case 2:
            case 3:
            default:
                break;
        }
    }
}


//int

//A switch statement in Java only accepts the following types as the expression inside switch(expression):
//✅ Valid Types:
//
//byte
//short
//char
//int
//String
//enum
//Wrapper classes (Byte, Short, Character, Integer, String)
//public static XXX getSwitch(int x){
//   return x - 20/x + x*x;
//}
//Breaking Down the Expression:

//x - 20/x + x*x
//For x = 10:

//10 - 20/10 + 10*10
//= 10 - 2 + 100
//= 108
//The result 108 is an integer (int).