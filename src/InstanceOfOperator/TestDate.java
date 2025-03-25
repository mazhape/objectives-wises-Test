package InstanceOfOperator;


//Expression (s instanceof java.util.Date) will return false if 's' is declared as a variable of class java.lang.String.
//Select 1 option(s):
//True
//False
public class TestDate {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s instanceof java.util.Date); // false
    }
}

//false
//It will not even compile because the compiler knows that 's' (which is declared as of class String) can NEVER refer to an object of class java.util.Date. So, it will not accept this code.
//Had 's' been declared as a variable of type Object, this code would have compiled because compiler sees that at run time it is possible for s to refer to an object of class Date.