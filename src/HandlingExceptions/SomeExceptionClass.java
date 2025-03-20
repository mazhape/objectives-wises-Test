package HandlingExceptions;

//in file A.java
public class A{
    protected void m() throws SomeException{}
}

//in file B.java
public class B extends A{
    public void m(){ }
}
public class SomeExceptionClass {
    public static void main(String[] args){
        //insert code here. //1
        A a = new B();
        ( ( B) a ).m();
    }
}


//A a = new B();
//( ( B) a ).m();
//Due to explicit casting of 'a' to B, the compiler knows that 'a' will point to an object of class B (or its subclass), whose method m() does not throw an exception. So there is no need for a try catch block here.