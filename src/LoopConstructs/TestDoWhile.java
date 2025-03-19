package LoopConstructs;

public class TestDoWhile {
    public static void main(String[] args) {
        int x = 10;
        do {
            x--;
            System.out.println(x);  // 1
        } while (x < 10);

    }
}


//



//Initial value: x = 10
//
//First Iteration:
//
//x-- → x = 9
//System.out.println(9); (Line //1 is executed)
//Check while condition: 9 < 10 → true, so the loop continues.
//Second Iteration:
//
//x-- → x = 8
//System.out.println(8); (Line //1 is executed)
//Check while condition: 8 < 10 → true, so the loop continues.
//Third Iteration:
//
//x-- → x = 7
//System.out.println(7); (Line //1 is executed)
//Check while condition: 7 < 10 → true, so the loop continues.
//Fourth Iteration:
//
//x-- → x = 6
//System.out.println(6); (Line //1 is executed)
//Check while condition: 6 < 10 → true, so the loop continues.
//Fifth Iteration:
//
//x-- → x = 5
//System.out.println(5); (Line //1 is executed)
//Check while condition: 5 < 10 → true, so the loop continues.
//Sixth Iteration:
//
//x-- → x = 4
//System.out.println(4); (Line //1 is executed)
//Check while condition: 4 < 10 → true, so the loop continues.
//Seventh Iteration:
//
//x-- → x = 3
//System.out.println(3); (Line //1 is executed)
//Check while condition: 3 < 10 → true, so the loop continues.
//Eighth Iteration:
//
//x-- → x = 2
//System.out.println(2); (Line //1 is executed)
//Check while condition: 2 < 10 → true, so the loop continues.
//Ninth Iteration:
//
//x-- → x = 1
//System.out.println(1); (Line //1 is executed)
//Check while condition: 1 < 10 → true, so the loop continues.
//Tenth Iteration:
//
//x-- → x = 0
//System.out.println(0); (Line //1 is executed)
//Check while condition: 0 < 10 → true, so the loop continues.
//Eleventh Iteration:
//
//x-- → x = -1
//System.out.println(-1); (Line //1 is executed)
//Check while condition: -1 < 10 → true, so the loop continues.
//Twelfth Iteration:
//
//x-- → x = -2
//System.out.println(-2); (Line //1 is executed)
//Check while condition: -2 < 10 → true, so the loop continues.
//...and so on (this creates an infinite loop because x < 10 is always true once x is decreased below 10).