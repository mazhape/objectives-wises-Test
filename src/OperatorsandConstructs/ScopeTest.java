package OperatorsandConstructs;

public class ScopeTest {
    static int x = 5;
    public static void main(String[] args){
        int x  = ( x=3 ) * 4;  // 1
        System.out.println(x);
    }
}

//12

//Key Components:
//Class variable: static int x = 5
//
//Local variable in main: int x = ...
//
//Execution Flow:
//At the start:
//
//Class-level x = 5
//
//No local x exists yet
//
//Line int x = (x=3) * 4:
//
//The expression is evaluated right-to-left (assignment has right associativity)
//
//First, (x=3) executes:
//
//This assigns 3 to the class variable x (not the local one)
//
//Returns the value 3
//
//Now the expression becomes int x = 3 * 4
//
//Creates a new local variable x and assigns 12 to it
//
//Important Notes:
//
//The x=3 assignment modifies the class variable, not the local one
//
//The local x only gets created and assigned the final value 12
//
//The class variable x remains 3 after execution
//
//Why It Works This Way:
//Java's variable resolution:
//
//When a local variable exists, it shadows the class variable
//
//But at the moment of x=3, the local x doesn't exist yet
//
//So x=3 modifies the class variable
//
//Evaluation order:
//
//The right-hand side is fully evaluated before the local variable is created
//
//So (x=3) happens before local x exists
//
//Final State:
//Class variable x = 3
//
//Local variable x = 12 (only this is printed)
//
//This demonstrates Java's handling of:
//
//Variable shadowing
//
//Evaluation order in declarations
//
//Difference between class and local variables