package OperatorsandConstructs;

public class ArithmeticOperations {
    public static void main(String[] args) {
        byte b = 1;
        char c = 1;
        short s = 1;
        int i = 1;
    }
}

//i = b + b; (Expression 2)
//
//s *= b; (Expression 3)
//
//s += i; (Expression 5)


//Why Others Are Invalid:
//s = b * b; → Needs explicit cast (s = (short)(b * b))
//
//c = c + b; → Needs explicit cast (c = (char)(c + b))
//
//Key Rules:
//Arithmetic Operations:
//
//byte, char, short operands are promoted to int
//
//Result is at least int
//
//Assignments:
//
//Narrowing conversions require explicit casts
//
//Except for compound assignments (+=, *=, etc.), which auto-cast
//
//Compound Assignments:
//
//E1 op= E2 is equivalent to E1 = (T)((E1) op (E2))
//
//Where T is the type of E1