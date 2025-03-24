package OperatorsandConstructs;

public class BooleanOperators {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
        if (b2 != b1 = !b2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

//Compile time error

//Note that  boolean operators have more precedence than =. (In fact, = has least precedence of all operators.)
//so, in (b2 != b1 = !b2)  first b2 != b1 is evaluated which returns a value 'false'. So the expression becomes false = !b2. And this is illegal because false is a value and not a variable!
//
//Had it been something like (b2 = b1 != b2) then it is valid because it will boil down to : b2 = false.
//Because all an if() needs is a boolean, now b1 != b2 returns false which is a boolean and as b2 =  false is an expression and every expression has a return value (which is actually the Left Hand Side of the expression). Here, it returns false, which is again a boolean.