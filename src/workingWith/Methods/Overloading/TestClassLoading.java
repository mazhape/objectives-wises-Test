package workingWith.Methods.Overloading;

public class TestClassLoading {
    public static void main(String[] args){
        new TestClassLoading().sayHello(); }   //1

    public static void sayHello(){
        System.out.println("Static Hello World"); }  //2

    public void sayHello() { System.out.println("Hello World "); }  //3
}
