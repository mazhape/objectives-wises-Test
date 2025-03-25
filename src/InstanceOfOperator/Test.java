package InstanceOfOperator;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

D d = new D();

//true

//Code example
//class A {}
//class B extends A {}
//class C extends B {}
//class D extends C {}
//
//public class Test {
//    public static void main(String[] args) {
//        D d = new D();
//        System.out.println(d instanceof A); // true
//        System.out.println(d instanceof B); // true
//        System.out.println(d instanceof C); // true
//        System.out.println(d instanceof D); // true
//    }
//}

