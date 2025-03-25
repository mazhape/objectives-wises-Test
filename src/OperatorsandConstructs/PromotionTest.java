package OperatorsandConstructs;

public class PromotionTest {
    public static void main(String args[]){
        int i = 5;
        float f = 5.5f;
        double d = 3.8;
        char c = 'a';  // 'a' has an ASCII value of 97

        if (i == f) c++;
        if (((int) (f + d)) == ((int) f + (int) d)) c += 2;
        System.out.println(c);
    }
}


//It will print a.

//Step 2: Evaluate the First if Condition
//Condition: i == f
//
//i is an int with value 5.
//
//f is a float with value 5.5f.
//
//Before comparison, i is promoted to a float (implicit type promotion).
//
//The comparison becomes 5.0f == 5.5f, which is false.
//
//Result:
//
//The condition is false, so c++ is not executed.
//
//c remains 'a'.
//
//Step 3: Evaluate the Second if Condition
//Condition: ((int) (f + d)) == ((int) f + (int) d)
//
//Break this down step by step:
//
//f + d → 5.5f + 3.8 → 9.3 (promoted to double).
//
//(int) (f + d) → (int) 9.3 → 9 (truncation).
//
//(int) f → (int) 5.5f → 5 (truncation).
//
//(int) d → (int) 3.8 → 3 (truncation).
//
//(int) f + (int) d → 5 + 3 → 8.
//
//The comparison becomes 9 == 8, which is false.
//
//Result:
//
//The condition is false, so c += 2 is not executed.
//
//c remains 'a'.
//
//Step 4: Print the Value of c
//The program prints the value of c, which is 'a'.