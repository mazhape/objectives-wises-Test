package OperatorsandConstructs;

public class MyClass{
    public static void main(String args[]){
        char c;
        int i;
        c = 'a';//1
        i = c;  //2
        i++;    //3
        c = i;  // 4 ❌ Compilation Error Invalid: int cannot be assigned to char without explicit casting
        c++;    //5
    }
}


//line 4


//Use explicit casting to convert int to char:

//c = (char) i; // ✅ Now it works!