package LoopConstructs;

public class TestClassContinue
{
    public static void main(String args[]){
        int i = 0;
        for (i=1 ;  i<5  ; i++) continue;  //(1)
        for (i=0 ;       ; i++) break;       //(2)
        for (    ; i<5?false:true ;    );     //(3)
    }
}


//The code will compile without error and will terminate without problem when run.