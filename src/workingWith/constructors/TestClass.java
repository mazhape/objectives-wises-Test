package workingWith.constructors;

public class TestClass {
    long l1;
    public void TestClass(long pLong) {
        l1 = pLong ; }  //(1)
    public static void main(String args[]){
        TestClass a, b ;
        a = new TestClass();  //(2)
        b = new TestClass(5);  //(3) This will cause a compilation error because there is no constructor that takes a long parameter.
    }
}

//A compilation error will be encountered at (3).
//Because (1) is a method and not a constructor. So there is no constructor that take a parameter.