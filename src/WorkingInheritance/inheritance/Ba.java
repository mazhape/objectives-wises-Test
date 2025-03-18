package WorkingInheritance.inheritance;

//In file A.java
//package ab;
class Ab{ //public class A
    Ab(){ }// Constructor has default (package-private) access.
    public void  print(){ System.out.println("A"); }
}

public class Ba extends Ab{
    Ba(){ }// Implicit call to super() is inserted here
    public void  print(){ System.out.println("B"); }
    public static void main(String[] args){
        new B();
    }
}

//It will not compile.
//Because A() is not accessible in B.