package LoopConstructs;

public class TestClassWhile {
    public static void main(String[] args){
        int k = 2;
        while(--k){ //pre-decrement k) returns an integer (not a boolean)
            System.out.println(k);
        }
    }
}

//It will not compile.