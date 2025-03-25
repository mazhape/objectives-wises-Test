package OperatorsandConstructs;

public class TestClassObj {
    public static void main(String[] args){
        Object obj1 = new Object();
        Object obj2 = obj1;
        if( obj1.equals(obj2) ) System.out.println("true");
        else  System.out.println("false");
    }
}

//it will print true.

//Here's why:
//
//Object Creation and Assignment:
//
//Object obj1 = new Object(); creates a new Object instance
//
//Object obj2 = obj1; makes obj2 reference the exact same object as obj1
//
//equals() Method Behavior:
//
//The equals() method in Object class (which is the default implementation) performs reference equality comparison
//
//It returns true if both references point to the exact same object in memory
//
//Since obj1 and obj2 refer to the same object, obj1.equals(obj2) returns true
//
//Flow Control:
//
//The if condition evaluates to true
//
//Therefore, "true" is printed
//
//Key points to note:
//
//This demonstrates reference equality, not value equality
//
//For most practical purposes, classes override equals() to provide meaningful comparison of object contents
//
//But in this case with plain Objects, we're just comparing references