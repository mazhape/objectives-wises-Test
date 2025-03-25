package OperatorsandConstructs;

public class TestClassBoolMetho {
    public static void main(String args[ ] ){
        int i = 0 ;
        boolean bool1 = true ;
        boolean bool2 = false;
        boolean bool  = false;
        bool = ( bool2 &  method1(i++) ); //1
        bool = ( bool2 && method1(i++) ); //2
        bool = ( bool1 |  method1(i++) ); //3
        bool = ( bool1 || method1(i++) ); //4
        System.out.println(i);
    }
    public static boolean method1(int i){
        return i>0 ? true : false;
    }
}


//It will print 2.


//Operators:
//
//& (bitwise AND) - evaluates both operands
//
//&& (logical AND) - short-circuits if first operand is false
//
//| (bitwise OR) - evaluates both operands
//
//|| (logical OR) - short-circuits if first operand is true
//
//Post-increment (i++):
//
//Uses the current value of i in the expression, then increments it
//
//Method method1(int i):
//
//Returns true if i > 0, false otherwise
//
//Step-by-Step Execution:
//Initial State:
//i = 0
//
//bool1 = true
//
//bool2 = false
//
//Line 1: bool = (bool2 & method1(i++));
//bool2 is false
//
//method1(i++):
//
//Current i = 0 is passed to method
//
//Then i increments to 1
//
//Returns false (since 0 > 0 is false)
//
//false & false → false
//
//Result: bool = false, i = 1
//
//Line 2: bool = (bool2 && method1(i++));
//bool2 is false
//
//Because this is && and first operand is false, second operand is NOT evaluated (short-circuiting)
//
//i++ is NOT executed
//
//Result: bool = false, i remains 1
//
//Line 3: bool = (bool1 | method1(i++));
//bool1 is true
//
//method1(i++):
//
//Current i = 1 is passed to method
//
//Then i increments to 2
//
//Returns true (since 1 > 0 is true)
//
//true | true → true
//
//Result: bool = true, i = 2
//
//Line 4: bool = (bool1 || method1(i++));
//bool1 is true
//
//Because this is || and first operand is true, second operand is NOT evaluated (short-circuiting)
//
//i++ is NOT executed
//
//Result: bool = true, i remains 2
//
//Final State:
//i = 2
//
//Output:
//The program will print: