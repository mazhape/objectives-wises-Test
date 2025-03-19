package LoopConstructs;

public class TestClassTrue {
    public static void main(String args[]){
        int k = 0;
        int m = 0;
        for ( int i = 0; i <= 3; i++){
            k++;
            if ( i == 2){
                // line 1
            }
            m++;
        }
        System.out.println( k + ", " + m );
    }
}


//It will print 3, 2 when line 1 is replaced by break;
//It will print 3, 3 when line 1 is replaced by i = 4;
//It will print 4, 3 when line 1 is replaced by continue.

