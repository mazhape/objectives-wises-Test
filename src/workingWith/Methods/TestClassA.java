package workingWith.Methods;

class A{
    String value = "test";
    A(String val){
        this.value = val;
    }
}
public class TestClassA {
    public static void main(String[] args) throws Exception {
        new A("new test").print();
    }
}

//It will not compile.
//There is no method named print() defined in class A. Further, there is no such method in class Object either.
//To print the contents of an object you can use toString() method that returns a String:
//System.out.println(a.toString());
//
//However, for this to print a meaningful value, class A should override the Object class's toString() method to return a meaningful String.