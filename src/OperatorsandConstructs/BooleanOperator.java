package OperatorsandConstructs;

public class BooleanOperator {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2  = false;
        if (b2 = b1 == false){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

    }
}




//It will print true

//Step-by-Step Evaluation:
//Initial Values:
//
//b1 = false
//
//b2 = false
//
//Condition Evaluation (b2 = b1 == false):
//
//This contains two operations: comparison (==) and assignment (=)
//
//Operator precedence: == has higher precedence than =
//
//So it evaluates as b2 = (b1 == false)
//
//Comparison Operation (b1 == false):
//
//b1 is false, so false == false evaluates to true
//
//Assignment Operation b2 = true:
//
//The result of the comparison (true) is assigned to b2
//
//The entire expression (b2 = (b1 == false)) evaluates to true (the assigned value)
//
//Now b2 = true
//
//If Condition:
//
//Since the condition evaluates to true, the if block executes
//
//System.out.println("true"); runs