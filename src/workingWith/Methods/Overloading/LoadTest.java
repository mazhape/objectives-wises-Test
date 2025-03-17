package workingWith.Methods.Overloading;

public class LoadTest {
    public static void main(String[] args) throws Exception {
        LoadTest t = new LoadTest();
        int i = t.getLoad();
        double d = t.getLoad();
        System.out.println( i + d );
    }

    public int getLoad() {
        return 1;
    }

    public double getLoad(){
        return 3.0;
    }
}

//The code will not compile.
//You cannot have more than one method in a class with the same signature. Method signature includes method name and the argument list but does not include return type.
//Therefore, the two getLoad() methods have the same signature and will not compile.
//
//This shows that method overloading cannot be done on the basis of the return types.
//The two methods getLoad() have identical method signatures:
//Method signature = method name + parameter list
//Here, both methods are named getLoad and take no parameters.
//Java does NOT allow method overloading based only on return type.
//Method overloading requires differences in parameters, not just return types.

//How to Fix It?
//Use Different Parameter Types
//public int getLoad() {
//    return 1;
//}
//
//public double getLoad(double x) {  // Parameter added to differentiate methods
//    return 3.0;
//}
// Solution 2: Use Different Parameter Counts
//public int getLoad() {
//    return 1;
//}
//public double getLoad(int x) {  // Method with one parameter
//    return 3.0;
//}