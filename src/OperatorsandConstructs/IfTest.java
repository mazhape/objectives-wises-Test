package OperatorsandConstructs;

public class IfTest {
    public static void main(String args[]){
        if (true)
            if (false)
                System.out.println("True False");
            else
                System.out.println("True True");
    }
}


//The code will compile correctly and will display True True.


//Outer if Condition:
//if (true)
//This condition is true, so we proceed to the inner if statement.
//Inner if Condition:

//if (false)
//This condition is false, so the program skips the System.out.println("True False"); statement.
//Inner else:

//else
//    System.out.println("True True");
//Since the inner if condition was false, this else block is executed.
//The program prints:
//True True