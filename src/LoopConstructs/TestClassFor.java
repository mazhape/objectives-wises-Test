package LoopConstructs;

public class TestClassFor {
    public static void main(String[] args){
        for : for(int i = 0; i< 10; i++){
            for (int j = 0; j< 10; j++){
                if ( i+ j > 10 )  break for;
            }
            System.out.println( "hello");
        }
    }
}

//It will not compile.

//Iteration 1 (i = 0):
//Inner Loop (j = 0 to j = 9):
//
//i + j ranges from 0 + 0 = 0 to 0 + 9 = 9.
//
//The condition i + j > 10 is never true.
//
//After Inner Loop:
//
//System.out.println("hello"); is executed.
//
//Output: hello
//
//Iteration 2 (i = 1):
//Inner Loop (j = 0 to j = 9):
//
//i + j ranges from 1 + 0 = 1 to 1 + 9 = 10.
//
//The condition i + j > 10 is never true.
//After Inner Loop:
//
//System.out.println("hello"); is executed.
//
//Output: hello
//
//Iteration 3 (i = 2):
//Inner Loop (j = 0 to j = 9):
//
//i + j ranges from 2 + 0 = 2 to 2 + 9 = 11.
//
//When j = 9, i + j = 11, which satisfies the condition i + j > 10.
//
//The break for; statement is executed, breaking out of the outer loop.