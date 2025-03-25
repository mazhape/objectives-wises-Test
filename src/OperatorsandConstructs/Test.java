package OperatorsandConstructs;

class Test{
    static boolean a;
    static boolean b;
    static boolean c;
    public static void main (String[] args){
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.print(a + ", " + b + ", " + c);
    }
}




//true, false, false
//``` 🚀
//
//### **Key Takeaways**
//1. **Operator Precedence Matters**
//   - `&&` has higher precedence than `||`.
//2. **Short-Circuit Behavior**
//   - If the left operand of `||` is `true`, the right operand **is not evaluated**.
//3. **Boolean Initialization in Java**
//   - **Static booleans are `false` by default**.

//Step 2: Boolean Expression Evaluation

//boolean bool = (a = true) || (b = true) && (c = true);
//Operator Precedence in Java
//&& (AND) has higher precedence than || (OR).
//This means the expression is evaluated as:

//(a = true) || ((b = true) && (c = true))
//Step-by-Step Evaluation
//Evaluate (a = true)
//a is assigned true.
//Expression (a = true) evaluates to true.
//Short-Circuit OR (||) Behavior
//Since || (OR) short-circuits when the left operand is true,
//((b = true) && (c = true)) is not evaluated at all.
//Therefore, b and c remain false.
//Step 3: Printing Values

//System.out.print(a + ", " + b + ", " + c);
//After execution:
//a = true
//b = false
//c = false