package LoopConstructs;

public class BreakTest{
    public static void main(String[] args){
        int i = 0, j = 5;
        lab1 : for( ; ; i++){
            for( ; ; --j)  if( i >j ) break lab1;
        }
        System.out.println(" i = "+i+", j = "+j);
    }
}


// i = 0, j = -1

//First Iteration of Outer Loop:
//
//i = 0.
//
//Inner loop starts with j = 5.
//
//Inner loop iterations:
//
//j = 5: i > j is false (0 > 5 is false).
//
//j = 4: i > j is false (0 > 4 is false).
//
//j = 3: i > j is false (0 > 3 is false).
//
//j = 2: i > j is false (0 > 2 is false).
//
//j = 1: i > j is false (0 > 1 is false).
//
//j = 0: i > j is false (0 > 0 is false).
//
//j = -1: i > j is true (0 > -1 is true).