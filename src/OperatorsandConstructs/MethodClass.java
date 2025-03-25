package OperatorsandConstructs;

public class MethodClass {
    public static void main(String[] args) {
        static int mx(int s){
            for(int i=0; i<3; i++){
                s = s + i;
            }
            return s;
        }
        int s = 5;
        s += s + mx(s) + ++s;
        System.out.println(s);
    }
}


//24


//Initial Value of s:
//
//s = 5.
//
//Evaluation of mx(s):
//
//The method mx(s) is called with s = 5.
//
//Inside the method:
//
//Iteration 1: i = 0, s = 5 + 0 = 5.
//
//Iteration 2: i = 1, s = 5 + 1 = 6.
//
//Iteration 3: i = 2, s = 6 + 2 = 8.
//
//The method returns 8.
//Evaluation of ++s:
//
//The ++s operation increments s by 1 before its value is used.
//
//        Initially, s = 5.
//
//After ++s, s = 6.
//
//Evaluation of s + mx(s) + ++s:
//
//Substitute the values:
//
//s = 5 (before ++s is evaluated).
//
//mx(s) = 8.
//
//        ++s = 6.
//
//The expression becomes: 5 + 8 + 6 = 19.
//
//Evaluation of s += ...:
//
//The += operator adds the right-hand side to the current value of s.
//
//Initially, s = 6 (after ++s).
//
//The expression becomes: s = 6 + 19 = 25.
//
//Final Value of s:
//
//s = 25.